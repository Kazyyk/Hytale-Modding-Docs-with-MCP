# CaveNodeChildEntryJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.cave | Extends: JsonLoader<SeedStringResource, CaveNodeType.CaveNodeChildEntry>

public class CaveNodeChildEntryJsonLoader extends JsonLoader<SeedStringResource, CaveNodeType.CaveNodeChildEntry>

JSON loader for cave node child entries. Parses the child node type references (inline or by name via CaveNodeTypeStorage), anchor position, offset, rotation options, children limit, repeat count, pitch/yaw modifiers, spawn chance, and yaw mode. Supports weighted lists of node types.

Also in this package: CaveBiomeMaskJsonLoader, CaveGeneratorJsonLoader, CaveNodeCoverEntryJsonLoader, CaveNodeTypeJsonLoader, CaveNodeTypeStorage, CavePrefabConfigJsonLoader, CavePrefabContainerJsonLoader, CavePrefabEntryJsonLoader, CaveTypeJsonLoader, CaveTypesJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants (and 3 more)

Complete API:
  public CaveNodeType.CaveNodeChildEntry load()
  protected IWeightedMap<CaveNodeType> loadNodes()
  protected CaveNodeType loadCaveNodeType(int index, JsonElement element)
  protected Vector3d loadAnchor()
  protected Vector3d loadOffset()
  protected PrefabRotation[] loadRotations()
  protected IDoubleRange loadChildrenLimit()
  protected IDoubleRange loadRepeat()
  protected CaveNodeType.CaveNodeChildEntry.OrientationModifier loadYawModifier()
  protected CaveNodeType.CaveNodeChildEntry.OrientationModifier loadPitchModifier()
  protected IFloatRange loadYawAdd()
  protected IFloatRange loadPitchAdd()
  protected IFloatRange loadYawSet()
  protected IFloatRange loadPitchSet()
  protected double loadChance()
  protected CaveYawMode loadYawMode()
  protected Vector3d loadVector(Vector3d vector, JsonElement jsonElement)

Fields:
protected final CaveNodeTypeStorage storage
