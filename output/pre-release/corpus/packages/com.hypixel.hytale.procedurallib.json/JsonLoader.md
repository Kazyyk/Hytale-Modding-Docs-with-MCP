# JsonLoader

Type: class | Package: com.hypixel.hytale.procedurallib.json | Extends: Loader

public abstract class JsonLoader<K extends SeedResource> extends Loader<K, T>

Abstract base for all JSON-based resource loaders. Extends `Loader` with JSON element access, file reference resolution, and typed accessor methods (`mustGetString`, `mustGetNumber`, `mustGetBool`, `mustGetObject`, `mustGetArray`). Constructor auto-loads external JSON when the root element contains a `"File"` key.

## Static Constants

- JSON_LOADER | JsonResourceLoader<JsonElement> | Generic JSON element loader (non-null check).
- JSON_ARR_LOADER | JsonResourceLoader<JsonArray> | JSON array loader with array type check.
- JSON_OBJ_LOADER | JsonResourceLoader<JsonObject> | JSON object loader with object type check.

## Key Methods

- `has(String name)`
- `getOrLoad(@Nonnull JsonElement element)`
- `get(String name)`
- `getRaw(String name)`
- `loadFile(@Nonnull String filePath)`
- `mustGetObject`
- `mustGetArray`
- `mustGetString`
- `mustGetBool`
- `mustGetNumber`

## Related Types

- JsonLoader.Constants -- inner interface defining `JSON_FILEPATH_SEPARATOR` and `KEY_FILE`

Known subclasses: AbstractCellJitterJsonLoader, BasicHeightThresholdInterpreterJsonLoader, BiomeInterpolationJsonLoader, BiomeJsonLoader, BiomeMaskJsonLoader, BiomePatternGeneratorJsonLoader, BlendNoisePropertyJsonLoader, BlockPlacementMaskJsonLoader, CaveBiomeMaskJsonLoader, CaveGeneratorJsonLoader, CaveNodeChildEntryJsonLoader, CaveNodeCoverEntryJsonLoader, CaveNodeShapeGeneratorJsonLoader, CaveNodeTypeJsonLoader, CavePrefabConfigJsonLoader, CavePrefabContainerJsonLoader, CavePrefabEntryJsonLoader, CaveTypeJsonLoader, CaveTypesJsonLoader, CellBorderDistanceFunctionJsonLoader, CellDistanceFunctionJsonLoader, CellNoiseJsonLoader, ClimateColorJsonLoader, ClimateGraphJsonLoader, ClimateGridJsonLoader, ClimateMaskJsonLoader, ClimateNoiseJsonLoader, ClimatePointJsonLoader, ClimateRuleJsonLoader, ClimateTypeJsonLoader, ConstantNoiseJsonLoader, ContinentThresholdsJsonLoader, CoordinateRandomizerJsonLoader, CoordinateRotatorJsonLoader, CoverContainerEntryJsonLoader, CoverContainerJsonLoader, CurveNoisePropertyJsonLoader, CustomBiomeGeneratorJsonLoader, DistanceNoiseJsonLoader, DoubleConditionJsonLoader, DoubleRangeJsonLoader, DoubleThresholdJsonLoader, DynamicLayerJsonLoader, EntryJsonLoader, EnvironmentContainerEntryJsonLoader, EnvironmentContainerJsonLoader, FadeContainerJsonLoader, FloatRangeJsonLoader, FluidLevelJsonLoader, GradientNoisePropertyJsonLoader, GridNoiseJsonLoader, HeightThresholdInterpreterJsonLoader, LayerContainerJsonLoader, LayerEntryJsonLoader, MaskProviderJsonLoader, NoiseBlockArrayJsonLoader, NoiseFunctionJsonLoader, NoiseHeightThresholdInterpreterJsonLoader, NoiseMaskConditionJsonLoader, NoisePropertyJsonLoader, OldSimplexNoiseJsonLoader, PerlinNoiseJsonLoader, PointGeneratorJsonLoader, PointNoiseJsonLoader, PrefabContainerEntryJsonLoader, PrefabContainerJsonLoader, PrefabPatternGeneratorJsonLoader, ResolvedBlockArrayJsonLoader, ResolvedVariantsBlockArrayLoader, ShapeDistortionJsonLoader, SimplexNoiseJsonLoader, StaticLayerJsonLoader, TintContainerEntryJsonLoader, TintContainerJsonLoader, UniqueClimateGeneratorJsonLoader, UniqueClimateJsonLoader, UniquePrefabConfigurationJsonLoader, UniquePrefabContainerJsonLoader, UniquePrefabGeneratorJsonLoader, UniqueZoneEntryJsonLoader, ValueNoiseJsonLoader, Vector2dJsonLoader, Vector3dJsonLoader, WaterContainerEntryJsonLoader, WaterContainerJsonLoader, WeightedPrefabMapJsonLoader, ZoneBiomesJsonLoader, ZoneColorMappingJsonLoader, ZoneCustomBiomesJsonLoader, ZoneJsonLoader, ZonePatternProviderJsonLoader, ZoneRequirementJsonLoader

Also in this package: AbstractCellJitterJsonLoader, BasicHeightThresholdInterpreterJsonLoader, BlendNoisePropertyJsonLoader, BranchNoiseJsonLoader, CellBorderDistanceFunctionJsonLoader, CellDistanceFunctionJsonLoader, CellNoiseJsonLoader, Constant, ConstantNoiseJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants (and 48 more)

Complete API:
  public boolean has(String name)
  public JsonElement getOrLoad(JsonElement element)
  public JsonElement get(String name)
  public JsonElement getRaw(String name)
  protected JsonElement loadFile(String filePath)
  protected JsonElement loadFileElem(String filePath)
  protected JsonElement loadFileConstructor(String filePath)
  protected JsonObject mustGetObject(String key, JsonObject defaultValue)
  protected JsonArray mustGetArray(String key, JsonArray defaultValue)
  protected String mustGetString(String key, String defaultValue)
  protected Boolean mustGetBool(String key, Boolean defaultValue)
  protected Number mustGetNumber(String key, Number defaultValue)
  protected V mustGet(String key, V defaultValue, Class<V> type, Predicate<JsonElement> predicate, Function<JsonElement,V> mapper)
  protected static V mustGet(String key, JsonElement element, V defaultValue, Class<V> type, Predicate<JsonElement> predicate, Function<JsonElement,V> mapper)
  protected static Error error(String format, Object args)
  protected static Error error(Throwable parent, String format, Object args)
  private static boolean isString(JsonElement element)
  protected static boolean isNumber(JsonElement element)
  protected static boolean isBoolean(JsonElement element)

Fields:
public static final JsonResourceLoader<JsonElement> JSON_LOADER
public static final JsonResourceLoader<JsonArray> JSON_ARR_LOADER
public static final JsonResourceLoader<JsonObject> JSON_OBJ_LOADER
protected static final JsonObject EMPTY_OBJECT
protected static final JsonArray EMPTY_ARRAY
protected final JsonElement json
