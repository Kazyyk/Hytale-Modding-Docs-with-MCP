# UniquePrefabConfigurationJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.prefab.unique | Extends: JsonLoader<SeedStringResource, UniquePrefabConfiguration>

public class UniquePrefabConfigurationJsonLoader extends JsonLoader<SeedStringResource, UniquePrefabConfiguration>

## Fields

- protected final ZoneFileContext zoneContext

## Constructors

- public UniquePrefabConfigurationJsonLoader(SeedString<SeedStringResource> seed, Path dataFolder, JsonElement json, ZoneFileContext zoneContext)

## Methods

- @Nonnull public UniquePrefabConfiguration load()
- @Nonnull protected IBlockFluidCondition loadParent()
- @Nullable protected ICoordinateRndCondition loadHeightThresholds()
- @Nullable protected IIntCondition loadBiomeMask()
- @Nullable protected PrefabRotation[] loadRotations()
- @Nonnull protected ICoordinateCondition loadMapCondition()
- @Nullable protected BlockMaskCondition loadMask()
- @Nonnull protected Vector2d loadAnchor()
- @Nonnull protected Vector3d loadSpawnOffset()
- protected int loadEnvironment()
- protected boolean loadFitHeightmap()
- protected boolean loadSubmerge()
- protected boolean loadOnWater()
- protected double loadMaxDistance()
- protected int loadMaxAttempts()
- protected double loadExclusionRadius()
- protected boolean loadIsSpawn()
- protected double loadZoneBorderExclusion()
- protected boolean loadShowOnMap()

## Inner Types

- `UniquePrefabConfigurationJsonLoader.Constants`

Also in this package: Constants

Complete API:
  public UniquePrefabConfiguration load()
  protected IBlockFluidCondition loadParent()
  protected ICoordinateRndCondition loadHeightThresholds()
  protected IIntCondition loadBiomeMask()
  protected PrefabRotation[] loadRotations()
  protected ICoordinateCondition loadMapCondition()
  protected BlockMaskCondition loadMask()
  protected Vector2d loadAnchor()
  protected Vector3d loadSpawnOffset()
  protected int loadEnvironment()
  protected boolean loadFitHeightmap()
  protected boolean loadSubmerge()
  protected boolean loadOnWater()
  protected double loadMaxDistance()
  protected int loadMaxAttempts()
  protected double loadExclusionRadius()
  protected boolean loadIsSpawn()
  protected double loadZoneBorderExclusion()
  protected boolean loadShowOnMap()

Fields:
protected final ZoneFileContext zoneContext
