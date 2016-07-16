package net.jumpingjaguar.tieredarmor.worldGen;

import net.jumpingjaguar.tieredarmor.init.ModBlocks;
import net.minecraft.block.state.pattern.BlockHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class WorldGenTiAr implements IWorldGenerator
{
	private WorldGenerator gen_einsteiniumOre; //Generates Baramite Ore (used in Overworld)
	private WorldGenerator gen_molybdeniteOre; //Generates Baramite Ore (used in Overworld)
	private WorldGenerator gen_baramiteOre; //Generates Baramite Ore (used in Overworld)
	private WorldGenerator gen_flametiteOre; //Generates Flametite Ore (used in Nether)

	public WorldGenTiAr()
	{
		this.gen_baramiteOre = new WorldGenMinable(ModBlocks.baramiteOre.getDefaultState(), 8);
		this.gen_molybdeniteOre = new WorldGenMinable(ModBlocks.molybdeniteOre.getDefaultState(), 8);
		this.gen_einsteiniumOre = new WorldGenMinable(ModBlocks.einsteiniumOre.getDefaultState(), 5);
		this.gen_flametiteOre = new WorldGenMinable(ModBlocks.flametiteOre.getDefaultState(), 6, BlockHelper.forBlock(Blocks.netherrack));
	}

	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
			throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

		int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chancesToSpawn; i ++) {
			int x = chunk_X * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunk_Z * 16 + rand.nextInt(16);
			generator.generate(world, rand, new BlockPos(x, y, z));
		}
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch (world.provider.getDimensionId()) {
			case 0: //Overworld
				this.runGenerator(this.gen_baramiteOre, world, random, chunkX, chunkZ, 15, 0, 64);
				this.runGenerator(this.gen_molybdeniteOre, world, random, chunkX, chunkZ, 13, 0, 64);
				this.runGenerator(this.gen_einsteiniumOre, world, random, chunkX, chunkZ, 9, 0, 10);
				break;
			case -1: //Nether
				this.runGenerator(this.gen_flametiteOre, world, random, chunkX, chunkZ, 4, 0, 256);
				break;
			case 1: //End

				break;
		}
	}
}
