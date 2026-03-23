# CaveTypeJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.cave | Extends: JsonLoader<SeedStringResource, CaveType>

public class CaveTypeJsonLoader extends JsonLoader<SeedStringResource, CaveType>

JSON loader for a complete cave type definition. Loads the entry node type, yaw/pitch/depth ranges, height radius factors, entry point generator, biome mask, block mask, noise mask, height condition, fixed entry height, fluid level, environment, surface-limited flag, submerge flag, and maximum size. The entry node type is loaded from a CaveNodeTypeStorage instance created per cave type.

Also in this package: CaveBiomeMaskJsonLoader, CaveGeneratorJsonLoader, CaveNodeChildEntryJsonLoader, CaveNodeCoverEntryJsonLoader, CaveNodeTypeJsonLoader, CaveNodeTypeStorage, CavePrefabConfigJsonLoader, CavePrefabContainerJsonLoader, CavePrefabEntryJsonLoader, CaveTypesJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants (and 3 more)

Complete API:
  public CaveType load()
  protected IFloatRange loadYaw()
  protected IFloatRange loadPitch()
  protected IFloatRange loadDepth()
  protected IHeightThresholdInterpreter loadHeightFactors()
  protected CaveNodeType loadEntryNodeType()
  protected ICoordinateCondition loadHeightCondition()
  protected IPointGenerator loadEntryPointGenerator()
  protected Int2FlagsCondition loadBiomeMask()
  protected BlockMaskCondition loadBlockMask()
  protected ICoordinateCondition loadMapCondition()
  protected IDoubleRange loadFixedEntryHeight()
  protected NoiseProperty loadFixedEntryHeightNoise()
  protected CaveType.FluidLevel loadFluidLevel()
  protected int loadEnvironment()
  protected boolean loadSurfaceLimited()
  protected boolean loadSubmerge()
  protected double loadMaximumSize(IPointGenerator pointGenerator)

Fields:
protected final Path caveFolder
protected final String name
protected final ZoneFileContext zoneContext
