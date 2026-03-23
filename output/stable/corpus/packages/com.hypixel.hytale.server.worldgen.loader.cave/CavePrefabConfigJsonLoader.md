# CavePrefabConfigJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.cave | Extends: JsonLoader<SeedStringResource, CavePrefabContainer.CavePrefabEntry.CavePrefabConfig>

public class CavePrefabConfigJsonLoader extends JsonLoader<SeedStringResource, CavePrefabContainer.CavePrefabEntry.CavePrefabConfig>

JSON loader for cave prefab placement configuration. Parses allowed rotations, placement mode, biome mask, block mask, iteration count, displacement range, noise condition, and height condition.

Also in this package: CaveBiomeMaskJsonLoader, CaveGeneratorJsonLoader, CaveNodeChildEntryJsonLoader, CaveNodeCoverEntryJsonLoader, CaveNodeTypeJsonLoader, CaveNodeTypeStorage, CavePrefabContainerJsonLoader, CavePrefabEntryJsonLoader, CaveTypeJsonLoader, CaveTypesJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants (and 3 more)

Complete API:
  public CavePrefabContainer.CavePrefabEntry.CavePrefabConfig load()
  protected PrefabRotation[] loadRotations()
  protected CavePrefabPlacement loadPlacement()
  protected IIntCondition loadBiomeMask()
  protected BlockMaskCondition loadBlockMask()
  protected IDoubleRange loadIterations()
  protected IDoubleCoordinateHashSupplier loadDisplacementSupplier()
  protected ICoordinateCondition loadNoiseCondition()
  protected ICoordinateRndCondition loadHeightCondition()

Fields:
private final ZoneFileContext zoneContext
