# PrefabPatternGenerator

Type: class | Package: com.hypixel.hytale.server.worldgen.prefab

public class PrefabPatternGenerator

Configures how prefabs are distributed across the world during generation. Combines a point generator (grid pattern), height/spawn conditions, block masks, rotation options, and displacement functions to control prefab placement.

## Methods

- public PrefabCategory getCategory()
- public IPointGenerator getGridGenerator()
- public ICoordinateCondition getMapCondition()
- public BlockMaskCondition getPrefabPlacementConfiguration()
- public boolean isFitHeightmap()
- public IBlockFluidCondition getParentCondition()
- public ICoordinateRndCondition getHeightCondition()
- public IHeightThresholdInterpreter getHeightThresholdInterpreter()
- public PrefabRotation[] getRotations()
- public int getDisplacement(int seed, int x, int z)
- public boolean isOnWater()
- public boolean isDeepSearch()
- public boolean isSubmerge()
- public int getMaxSize()
- public int getExclusionRadius()

Also in this package: PrefabCategory, PrefabLoadingCache, PrefabPasteBuffer, PrefabPasteUtil, PrefabStoreRoot

Complete API:
  public PrefabCategory getCategory()
  public IPointGenerator getGridGenerator()
  public ICoordinateCondition getMapCondition()
  public BlockMaskCondition getPrefabPlacementConfiguration()
  public boolean isFitHeightmap()
  public IBlockFluidCondition getParentCondition()
  public ICoordinateRndCondition getHeightCondition()
  public IHeightThresholdInterpreter getHeightThresholdInterpreter()
  public PrefabRotation[] getRotations()
  public int getDisplacement(int seed, int x, int z)
  public boolean isOnWater()
  public boolean isDeepSearch()
  public boolean isSubmerge()
  public int getMaxSize()
  public int getExclusionRadius()
  public String toString()

Fields:
protected final int seedOffset
protected final PrefabCategory category
protected final IPointGenerator gridGenerator
protected final ICoordinateRndCondition heightCondition
protected final IHeightThresholdInterpreter heightThresholdInterpreter
protected final BlockMaskCondition prefabPlacementConfiguration
protected final ICoordinateCondition mapCondition
protected final IBlockFluidCondition parentCondition
protected final PrefabRotation[] rotations
protected final ICoordinateDoubleSupplier displacement
protected final boolean fitHeightmap
protected final boolean onWater
protected final boolean deepSearch
protected final boolean submerge
protected final int maxSize
protected final int exclusionRadius
