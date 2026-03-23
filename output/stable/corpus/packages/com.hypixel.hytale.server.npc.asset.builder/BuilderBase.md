# BuilderBase

Type: abstract class | Package: com.hypixel.hytale.server.npc.asset.builder | Implements: Builder<T>

public abstract class BuilderBase<T> implements Builder<T>

The abstract base implementation of the Builder interface. Provides the complete infrastructure for reading NPC JSON configuration files: attribute parsing (strings, ints, doubles, booleans, enums, arrays, assets, objects), expression evaluation, validation, schema generation, feature evaluation, state mapping, and instruction context handling.

This is the largest class in the builder package. Concrete builder types (for Actions, Sensors, BodyMotions, HeadMotions, Instructions, etc.) extend `BuilderBase` and override `readConfig(JsonElement)` to declare their specific JSON attributes.

## Type Parameters

- T | The runtime type this builder produces.

## Key Fields

- fileName | String | Name of the JSON file being read.
- queriedKeys | Set<String> | Set of JSON keys that have been read, used to detect unknown attributes.
- useDefaultsOnly | boolean | When true, attribute readers return defaults without reading JSON.
- label | String | Label for breadcrumb error reporting.
- typeName | String | Type discriminator name from the factory.
- evaluatorHelper | FeatureEvaluatorHelper | Feature provider evaluation.
- stateHelper | StateMappingHelper | State machine index mapping.
- instructionContextHelper | InstructionContextHelper | Instruction context validation.
- builderParameters | BuilderParameters | Parameter definitions and scope.
- builderManager | BuilderManager | The manager loading this builder.
- builderDescriptor | BuilderDescriptor | Schema descriptor.
- readErrors | List<String> | Errors accumulated during read.

## Configuration Reading Lifecycle


public final void readConfig(BuilderContext owner, @Nonnull JsonElement data, BuilderManager builderManager, BuilderParameters builderParameters, BuilderValidationHelper builderValidationHelper)

Orchestrates the full read lifecycle:
1. `preReadConfig` -- initializes fields from the validation helper.
2. `readCommonConfig` -- reads common attributes shared by all builders.
3. `readConfig(JsonElement)` -- subclass-specific attribute reading (abstract).
4. `postReadConfig` -- detects unknown JSON keys.

## Abstract Methods


@Nonnull
public abstract Builder<T> readConfig(@Nonnull JsonElement data);

Subclasses override this to read their specific JSON attributes.


@Nullable
public abstract String getShortDescription();

Returns a brief description for schema/documentation.


@Nullable
public abstract String getLongDescription();

Returns a detailed description for schema/documentation.

## Attribute Reading Methods

`BuilderBase` provides a large family of `require*` and `optional*` methods for reading typed values from JSON. Each method registers the key, reads the value, validates it, and feeds it to a consumer or holder. Key families include:

- **Strings:** `requireString`, `optionalString`, `requireStringList`, `readString`
- **Numbers:** `requireInt`, `optionalInt`, `requireDouble`, `optionalDouble`, `requireFloat`, `optionalFloat`
- **Booleans:** `requireBoolean`, `optionalBoolean`
- **Enums:** `requireEnum`, `optionalEnum`, `requireEnumSet`, `optionalEnumArray`
- **Arrays:** `requireNumberArray`, `optionalNumberArray`, `requireStringArray`, `optionalStringArray`, `requireBooleanArray`, `optionalTemporalArray`
- **Assets:** `requireAsset`, `optionalAsset`, `requireAssetArray`
- **Objects:** `requireObject`, `optionalObject`, `requireObjectList`, `requireObjectMap`
- **Codec objects:** `requireCodecObject`, `optionalCodecObject`

## Static Utility Methods


public static JsonElement expectKey(@Nonnull JsonObject jsonObject, @Nonnull String key)

Returns the value for a required JSON key, throwing if absent.


public static JsonObject expectObject(@Nonnull JsonElement element)
public static JsonObject expectObject(@Nonnull JsonElement element, @Nonnull String name)

Casts a JSON element to an object, throwing a descriptive error on type mismatch.


public static boolean readBoolean(@Nonnull JsonObject data, @Nonnull String key, boolean defaultValue)
public static String readString(@Nonnull JsonObject data, @Nonnull String key)
public static String readString(@Nonnull JsonObject data, @Nonnull String key, String defaultValue)
public static String[] readStringArray(@Nonnull JsonObject data, @Nonnull String key, StringValidator validator, BuilderParameters parameters)

Static helpers for reading primitives and arrays from JSON objects.


public static <E extends Enum<E>> String getDomain(E[] constants)

Generates a comma-separated domain string from enum constants.

## Related Types

- Builder -- the interface this class implements
- BuilderBaseWithType -- extends this with a `Type` field
- SpawnableWithModelBuilder -- extends this for spawnable entities
- BuilderComponent -- extends this for generic components
- BuilderFactory -- creates instances via type discriminator
- BuilderValidationHelper -- bundles validation context

Known subclasses: Builder, Builder, BuilderActionBase, BuilderActionList, BuilderBaseWithType, BuilderCombatTargetCollector, BuilderComponent, BuilderEntityFilterWithToggle, BuilderInstruction, BuilderMotionBase, BuilderMotionControllerMap, BuilderRelativeWaypointDefinition, BuilderSensorBase, BuilderSensorEntityPrioritiserBase, BuilderStateTransition, BuilderStateTransitionController, BuilderStateTransitionEdges, BuilderTransientPathDefinition, BuilderValueToParameterMapping, BuilderWeightedAction, SpawnableWithModelBuilder

Also in this package: Builder, BuilderAssetMonitorHandler, BuilderAttributeDescriptor, BuilderBaseWithType, BuilderCodecObjectHelper, BuilderCombatConfig, BuilderComponent, BuilderContext, BuilderDescriptor, BuilderDescriptorState, BuilderFactory, BuilderInfo, BuilderManager, BuilderModifier, BuilderObjectArrayHelper, BuilderObjectHelper, BuilderObjectListHelper, BuilderObjectMapHelper, BuilderObjectReferenceHelper, BuilderObjectStaticHelper (and 28 more)

Complete API:
  public void setTypeName(String name)
  public String getTypeName()
  public String getLabel()
  public void setLabel(String label)
  public FeatureEvaluatorHelper getEvaluatorHelper()
  public StateMappingHelper getStateMappingHelper()
  public InstructionContextHelper getInstructionContextHelper()
  public void validateReferencedProvidedFeatures(BuilderManager manager, ExecutionContext context)
  public boolean canRequireFeature()
  public boolean excludeFromRegularBuilding()
  public final void readConfig(BuilderContext owner, JsonElement data, BuilderManager builderManager, BuilderParameters builderParameters, BuilderValidationHelper builderValidationHelper)
  private void preReadConfig(BuilderContext owner, BuilderManager builderManager, BuilderParameters builderParameters, BuilderValidationHelper builderValidationHelper)
  private void addQueryKey(String name)
  public BuilderContext getOwner()
  public void ignoreAttribute(String name)
  private void postReadConfig(JsonElement data)
  public Builder<T> readCommonConfig(JsonElement data)
  public Builder<T> readConfig(JsonElement data)
  public BuilderManager getBuilderManager()
  public BuilderParameters getBuilderParameters()
  protected JsonObject expectJsonObject(JsonElement data, String name)
  protected JsonArray expectJsonArray(JsonElement data, String name)
  protected String expectString(JsonElement data, String name)
  protected double expectDouble(JsonElement data, String name)
  protected int expectInteger(JsonElement data, String name)
  protected boolean expectBoolean(JsonElement data, String name)
  protected int[] expectIntArray(JsonElement data, String name, int minSize, int maxSize)
  protected int[] expectIntArray(JsonElement data, String name, int size)
  protected double[] expectDoubleArray(JsonElement data, String name, int minSize, int maxSize)
  protected double[] expectDoubleArray(JsonElement data, String name, int size)
  protected JsonArray expectJsonArray(JsonElement data, String name, int minSize, int maxSize)
  protected void checkForUnexpectedComputeObject(JsonElement data, String name)
  protected JsonElement getRequiredJsonElement(JsonElement data, String name, boolean addKey)
  protected JsonElement getRequiredJsonElement(JsonElement data, String name)
  protected JsonElement getRequiredJsonElementIfNotOverridden(JsonElement data, String name, ParameterType type, boolean addKey)
  protected JsonElement getRequiredJsonElementIfNotOverridden(JsonElement data, String name, ParameterType type)
  protected JsonElement getOptionalJsonElement(JsonElement data, String name, boolean addKey)
  protected JsonElement getOptionalJsonElement(JsonElement data, String name)
  public void requireString(JsonElement data, String name, Consumer<String> setter, StringValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public boolean getString(JsonElement data, String name, Consumer<String> setter, String defaultValue, StringValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public void requireString(JsonElement data, String name, StringHolder stringHolder, StringValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public boolean requireStringIfNotOverridden(JsonElement data, String name, StringHolder stringHolder, StringValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public boolean getString(JsonElement data, String name, StringHolder stringHolder, String defaultValue, StringValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  private void validateAndSet(String str, StringValidator validator, Consumer<String> setter, String name)
  protected String[] nonNull(String[] array)
  public String[] expectStringArray(JsonElement data, Function<String,String> mapper, String name, boolean warning)
  public String[] expectStringArray(JsonElement data, Function<String,String> mapper, String name)
  public boolean getStringArray(JsonElement data, String name, Consumer<String[]> setter, Function<String,String> mapper, String[] defaultValue, StringArrayValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public void requireStringArray(JsonElement data, String name, Consumer<String[]> setter, Function<String,String> mapper, StringArrayValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public void requireStringArray(JsonElement data, String name, StringArrayHolder holder, int minLength, int maxLength, StringArrayValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public void requireTemporalArray(JsonElement data, String name, TemporalArrayHolder holder, int minLength, int maxLength, TemporalArrayValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public void requireTemporalRange(JsonElement data, String name, TemporalArrayHolder holder, TemporalArrayValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public boolean getStringArray(JsonElement data, String name, StringArrayHolder holder, String[] defaultValue, int minLength, int maxLength, StringArrayValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  private void validateAndSet(String[] value, StringArrayValidator validator, Consumer<String[]> setter, String name)
  private String defaultArrayToString(String[] defaultValue)
  private boolean requireOrGetDictionary(JsonElement data, String name, String domain, BiConsumer<String,JsonElement> setter, boolean required, BuilderDescriptorState state, String shortDescription, String longDescription)
  public void requireDictionary(JsonElement data, String name, String domain, BiConsumer<String,JsonElement> setter, BuilderDescriptorState state, String shortDescription, String longDescription)
  public boolean getDictionary(JsonElement data, String name, String domain, BiConsumer<String,JsonElement> setter, BuilderDescriptorState state, String shortDescription, String longDescription)
  public void requireDouble(JsonElement data, String name, DoubleConsumer setter, DoubleValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public boolean getDouble(JsonElement data, String name, DoubleConsumer setter, double defaultValue, DoubleValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public void requireDouble(JsonElement data, String name, DoubleHolder doubleHolder, DoubleValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public boolean requireDoubleIfNotOverridden(JsonElement data, String name, DoubleHolder doubleHolder, DoubleValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public boolean getDouble(JsonElement data, String name, DoubleHolder doubleHolder, double defaultValue, DoubleValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  private void validateAndSet(double v, DoubleValidator validator, DoubleConsumer setter, String name)
  public void requireIntArray(JsonElement data, String name, Consumer<int[]> setter, int minLength, int maxLength, IntArrayValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public boolean getIntArray(JsonElement data, String name, Consumer<int[]> setter, int[] defaultValue, int minLength, int maxLength, IntArrayValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public void requireIntArray(JsonElement data, String name, NumberArrayHolder holder, int minLength, int maxLength, IntArrayValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public boolean getIntArray(JsonElement data, String name, NumberArrayHolder holder, int[] defaultValue, int minLength, int maxLength, IntArrayValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public void requireIntRange(JsonElement data, String name, Consumer<int[]> setter, IntArrayValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public boolean getIntRange(JsonElement data, String name, Consumer<int[]> setter, int[] defaultValue, IntArrayValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public void requireIntRange(JsonElement data, String name, NumberArrayHolder holder, IntArrayValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public boolean getIntRange(JsonElement data, String name, NumberArrayHolder holder, int[] defaultValue, IntArrayValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  private void validateAndSet(int[] v, IntArrayValidator validator, Consumer<int[]> setter, String name)
  public void requireDoubleArray(JsonElement data, String name, Consumer<double[]> setter, int minLength, int maxLength, DoubleArrayValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public boolean getDoubleArray(JsonElement data, String name, Consumer<double[]> setter, double[] defaultValue, int minLength, int maxLength, DoubleArrayValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public void requireDoubleArray(JsonElement data, String name, NumberArrayHolder holder, int minLength, int maxLength, DoubleArrayValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public boolean getDoubleArray(JsonElement data, String name, NumberArrayHolder holder, double[] defaultValue, int minLength, int maxLength, DoubleArrayValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public void requireDoubleRange(JsonElement data, String name, Consumer<double[]> setter, DoubleArrayValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public boolean getDoubleRange(JsonElement data, String name, Consumer<double[]> setter, double[] defaultValue, DoubleArrayValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public void requireVector3d(JsonElement data, String name, Consumer<double[]> setter, DoubleArrayValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public boolean getVector3d(JsonElement data, String name, Consumer<double[]> setter, double[] defaultValue, DoubleArrayValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public void requireDoubleRange(JsonElement data, String name, NumberArrayHolder holder, DoubleArrayValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public boolean getDoubleRange(JsonElement data, String name, NumberArrayHolder holder, double[] defaultValue, DoubleArrayValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public void requireVector3d(JsonElement data, String name, NumberArrayHolder holder, DoubleArrayValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public boolean getVector3d(JsonElement data, String name, NumberArrayHolder holder, double[] defaultValue, DoubleArrayValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  private void validateAndSet(double[] v, DoubleArrayValidator validator, Consumer<double[]> setter, String name)
  public static Vector3d createVector3d(double[] coordinates)
  public static Vector3d createVector3d(double[] coordinates, Supplier<Vector3d> defaultSupplier)
  public void requireFloat(JsonElement data, String name, FloatConsumer setter, DoubleValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public boolean getFloat(JsonElement data, String name, FloatConsumer setter, float defaultValue, DoubleValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public void requireFloat(JsonElement data, String name, FloatHolder floatHolder, DoubleValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public boolean getFloat(JsonElement data, String name, FloatHolder floatHolder, double defaultValue, DoubleValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  private void validateAndSet(float v, DoubleValidator validator, FloatConsumer setter, String name)
  public void requireInt(JsonElement data, String name, IntConsumer setter, IntValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public boolean getInt(JsonElement data, String name, IntConsumer setter, int defaultValue, IntValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public void requireInt(JsonElement data, String name, IntHolder intHolder, IntValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public boolean requireIntIfNotOverridden(JsonElement data, String name, IntHolder intHolder, IntValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public boolean getInt(JsonElement data, String name, IntHolder intHolder, int defaultValue, IntValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  private void validateAndSet(int v, IntValidator validator, IntConsumer setter, String name)
  public void requireBoolean(JsonElement data, String name, BooleanHolder booleanHolder, BuilderDescriptorState state, String shortDescription, String longDescription)
  public boolean getBoolean(JsonElement data, String name, BooleanHolder booleanHolder, boolean defaultValue, BuilderDescriptorState state, String shortDescription, String longDescription)
  public void requireBoolean(JsonElement data, String name, BooleanConsumer setter, BuilderDescriptorState state, String shortDescription, String longDescription)
  public boolean getBoolean(JsonElement data, String name, BooleanConsumer setter, boolean defaultValue, BuilderDescriptorState state, String shortDescription, String longDescription)
  public void getParameterBlock(JsonElement data, BuilderDescriptorState state, String shortDescription, String longDescription)
  public void cleanupParameters()
  protected E resolveValue(String txt, E[] enumConstants, String paramName)
  public static E stringToEnum(String value, E[] enumConstants, String ident)
  public static String getDomain(E[] enumConstants)
  private static String formatEnumCamelCase(String name)
  private static String[] getEnumValues(Class<E> enumClass)
  public void requireEnum(JsonElement data, String name, Consumer<E> setter, Class<E> clazz, BuilderDescriptorState state, String shortDescription, String longDescription)
  public boolean getEnum(JsonElement data, String name, Consumer<E> setter, Class<E> clazz, E defaultValue, BuilderDescriptorState state, String shortDescription, String longDescription)
  public void requireEnum(JsonElement data, String name, EnumHolder<E> enumHolder, Class<E> clazz, BuilderDescriptorState state, String shortDescription, String longDescription)
  public boolean getEnum(JsonElement data, String name, EnumHolder<E> enumHolder, Class<E> clazz, E defaultValue, BuilderDescriptorState state, String shortDescription, String longDescription)
  public static String[] enumSetToStrings(EnumSet<E> enumSet)
  public static EnumSet<E> stringsToEnumSet(String[] array, Class<E> clazz, E[] enumConstants, String ident)
  public static E[] stringsToEnumArray(String[] array, Class<E> clazz, E[] enumConstants, String ident)
  protected void toSet(String name, Class<E> clazz, EnumSet<E> t, String elementAsString)
  protected EnumSet<RoleDebugFlags> toDebugFlagSet(String name, String elementAsString)
  protected void toSet(String name, Class<E> clazz, EnumSet<E> t, JsonArray jsonArray)
  protected void toSet(String name, Class<E> clazz, EnumSet<E> t, JsonElement jsonElement)
  public void requireEnumArray(JsonElement data, String name, EnumArrayHolder<E> enumArrayHolderHolder, Class<E> clazz, EnumArrayValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public void requireEnumSet(JsonElement data, String name, Consumer<? super EnumSet<E>> setter, Class<E> clazz, Supplier<? extends EnumSet<E>> factory, BuilderDescriptorState state, String shortDescription, String longDescription)
  public boolean getEnumSet(JsonElement data, String name, Consumer<? super EnumSet<E>> setter, Class<E> clazz, Supplier<? extends EnumSet<E>> factory, EnumSet<E> defaultValue, BuilderDescriptorState state, String shortDescription, String longDescription)
  public void requireEnumSet(JsonElement data, String name, EnumSetHolder<E> enumSetHolder, Class<E> clazz, BuilderDescriptorState state, String shortDescription, String longDescription)
  public boolean getEnumSet(JsonElement data, String name, EnumSetHolder<E> enumSetHolder, Class<E> clazz, EnumSet<E> defaultValue, BuilderDescriptorState state, String shortDescription, String longDescription)
  private Schema getObjectSchema(Class<?> classType)
  public boolean getObject(JsonElement data, String name, BuilderObjectReferenceHelper<?> builderObjectReferenceHelper, BuilderDescriptorState state, String shortDescription, String longDescription, BuilderValidationHelper builderValidationHelper)
  public void requireObject(JsonElement data, String name, BuilderObjectReferenceHelper<?> builderObjectReferenceHelper, BuilderDescriptorState state, String shortDescription, String longDescription, BuilderValidationHelper builderValidationHelper)
  public boolean getCodecObject(JsonElement data, String name, BuilderCodecObjectHelper<?> helper, BuilderDescriptorState state, String shortDescription, String longDescription)
  public void requireCodecObject(JsonElement data, String name, BuilderCodecObjectHelper<?> helper, BuilderDescriptorState state, String shortDescription, String longDescription)
  public void requireEmbeddableArray(JsonElement data, String embedTag, BuilderObjectArrayHelper<?,?> builderObjectArrayHelper, ArrayValidator arrayValidator, BuilderDescriptorState state, String shortDescription, String longDescription, BuilderValidationHelper builderValidationHelper)
  public boolean getArray(JsonElement data, String name, BuilderObjectArrayHelper<?,?> builderObjectArrayHelper, ArrayValidator arrayValidator, BuilderDescriptorState state, String shortDescription, String longDescription, BuilderValidationHelper builderValidationHelper)
  public void requireArray(JsonElement data, String name, BuilderObjectArrayHelper<?,?> builderObjectArrayHelper, ArrayValidator arrayValidator, BuilderDescriptorState state, String shortDescription, String longDescription, BuilderValidationHelper builderValidationHelper)
  private void requireArray0(JsonElement data, String name, BuilderObjectArrayHelper<?,?> builderObjectArrayHelper, ArrayValidator validator, BuilderValidationHelper builderValidationHelper)
  public void requireArray(JsonElement data, BuilderObjectArrayHelper<?,?> builderObjectArrayHelper, ArrayValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription, BuilderValidationHelper builderValidationHelper)
  public void requireAsset(JsonElement data, String name, Consumer<String> setter, AssetValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public boolean getAsset(JsonElement data, String name, Consumer<String> setter, String defaultValue, AssetValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public void requireAsset(JsonElement data, String name, AssetHolder assetHolder, AssetValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public boolean getAsset(JsonElement data, String name, AssetHolder assetHolder, String defaultValue, AssetValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  private void validateAndSet(String str, AssetValidator validator, Consumer<String> setter, String name)
  public static boolean validateAssetList(String[] assetList, AssetValidator validator, String attributeName, boolean testExistance)
  public static boolean validateAsset(String assetName, AssetValidator validator, String attributeName, boolean testExistance)
  private void validateSingleAsset(String assetName, AssetValidator validator, String attributeName)
  public boolean getAssetArray(JsonElement data, String name, Consumer<String[]> setter, Function<String,String> mapper, String[] defaultValue, AssetValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public boolean getAssetArray(JsonElement data, String name, AssetArrayHolder assetHolder, String[] defaultValue, int minLength, int maxLength, AssetValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public void requireAssetArray(JsonElement data, String name, Consumer<String[]> setter, Function<String,String> mapper, AssetValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  public void requireAssetArray(JsonElement data, String name, AssetArrayHolder assetHolder, int minLength, int maxLength, AssetValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  private void validateAndSet(String[] assetList, AssetValidator validator, Consumer<String[]> setter, String attributeName)
  protected BuilderDescriptor createDescriptor(Builder<?> builder, String builderName, String categoryName, BuilderManager builderManager, BuilderDescriptorState state, String shortDescription, String longDescription, Set<String> tags)
  protected boolean isCreatingDescriptor()
  protected boolean isCreatingSchema()
  public String getSchemaName()
  public Schema toSchema(SchemaContext context)
  public final BuilderDescriptor getDescriptor(String builderName, String categoryName, BuilderManager builderManager)
  public abstract String getShortDescription()
  public abstract String getLongDescription()
  public void registerTags(Set<String> tags)
  public abstract BuilderDescriptorState getBuilderDescriptorState()
  protected void validateNotAllStringsEmpty(String attribute1, String string1, String attribute2, String string2)
  protected void validateAtMostOneString(String attribute1, String string1, String attribute2, String string2)
  protected void validateOneSetString(String attribute1, String string1, String attribute2, String string2)
  protected void validateOneSetAsset(AssetHolder value1, String attribute2, String string2)
  protected void validateOneSetAsset(AssetHolder value1, AssetHolder value2)
  protected void validateOneSetAssetArray(AssetArrayHolder value1, String attribute2, String[] value2)
  protected void validateOneSetAssetArray(AssetArrayHolder value1, AssetArrayHolder value2)
  protected void validateNoDuplicates(Iterable<K> list, String variableName)
  protected void validateDoubleRelation(String attribute1, double value1, RelationalOperator relation, String attribute2, double value2)
  protected void validateDoubleRelation(DoubleHolder value1, RelationalOperator relation, String attribute2, double value2)
  protected void validateDoubleRelation(String attribute1, double value1, RelationalOperator relation, DoubleHolder value2)
  protected void validateDoubleRelation(DoubleHolder value1, RelationalOperator relation, DoubleHolder value2)
  protected void validateFloatRelation(String attribute1, float value1, RelationalOperator relation, String attribute2, float value2)
  protected void validateFloatRelation(FloatHolder value1, RelationalOperator relation, String attribute2, float value2)
  protected void validateFloatRelation(String attribute1, float value1, RelationalOperator relation, FloatHolder value2)
  protected void validateFloatRelation(FloatHolder value1, RelationalOperator relation, FloatHolder value2)
  protected void validateIntRelation(String attribute1, int value1, RelationalOperator relation, String attribute2, int value2)
  protected void validateIntRelation(IntHolder value1, RelationalOperator relation, String attribute2, int value2)
  protected void validateIntRelation(String attribute1, int value1, RelationalOperator relation, IntHolder value2)
  protected void validateIntRelation(IntHolder value1, RelationalOperator relation, IntHolder value2)
  protected void validateIntRelationIfBooleanIs(boolean targetValue, boolean actualValue, IntHolder value1, RelationalOperator relation, IntHolder value2)
  protected void validateAnyPresent(String attribute1, BuilderObjectHelper<?> objectHelper1, String attribute2, BuilderObjectHelper<?> objectHelper2)
  protected void validateAnyPresent(String attribute1, BuilderObjectHelper<?> objectHelper1, String attribute2, BuilderObjectHelper<?> objectHelper2, String attribute3, BuilderObjectHelper<?> objectHelper3)
  protected void validateAnyPresent(String[] attributes, BuilderObjectHelper<?>[] objectHelpers)
  protected void validateOnePresent(String attribute1, BuilderObjectHelper<?> objectHelper1, String attribute2, BuilderObjectHelper<?> objectHelper2)
  protected void validateOnePresent(String attribute1, BuilderObjectHelper<?> objectHelper1, String attribute2, BuilderObjectHelper<?> objectHelper2, String attribute3, BuilderObjectHelper<?> objectHelper3)
  protected void validateOnePresent(String[] attributes, BuilderObjectHelper<?>[] objectHelpers)
  protected void validateOnePresent(String[] attributes, boolean[] readStatus)
  protected void validateOneOrNonePresent(String attribute1, BuilderObjectHelper<?> objectHelper1, String attribute2, BuilderObjectHelper<?> objectHelper2)
  protected void validateOneOrNonePresent(String attribute1, BuilderObjectHelper<?> objectHelper1, String attribute2, BuilderObjectHelper<?> objectHelper2, String attribute3, BuilderObjectHelper<?> objectHelper3)
  protected void validateOneOrNonePresent(String[] attributes, BuilderObjectHelper<?>[] objectHelpers)
  protected void validateOneOrNonePresent(String[] attributes, boolean[] readStatus)
  protected void validateExistsIfParameterSet(String parameter, boolean value, String attribute, BuilderObjectHelper<?> objectHelper)
  protected void validateStringIfEnumIs(StringHolder parameter, StringValidator validator, EnumHolder<E> enumParameter, E targetValue)
  protected void validateStringIfEnumIs(StringHolder parameter, StringValidator validator, String enumName, E targetValue, E enumValue)
  protected void validateAssetIfEnumIs(AssetHolder parameter, AssetValidator validator, EnumHolder<E> enumParameter, E targetValue)
  protected void validateAssetIfEnumIs(AssetHolder parameter, AssetValidator validator, String enumName, E targetValue, E enumValue)
  protected void validateAny(String attribute1, boolean value1, String attribute2, boolean value2)
  protected void validateAny(BooleanHolder value1, BooleanHolder value2)
  protected void validateAny(BooleanHolder value1, String attribute2, boolean value2)
  protected void validateAny(String attribute1, boolean value1, String attribute2, boolean value2, String attribute3, boolean value3)
  protected void validateAny(String[] attributes, boolean[] values)
  protected void validateAtMostOne(BooleanHolder value1, BooleanHolder value2)
  protected void validateAtMostOne(BooleanHolder value1, String attribute2, boolean value2)
  protected void validateBooleanImplicationAnyAntecedent(String[] attributes1, boolean[] values1, boolean antecedentState, String[] attributes2, boolean[] values2, boolean consequentState)
  protected void validateBooleanImplicationAllAntecedents(String[] attributes1, boolean[] values1, boolean antecedentState, String[] attributes2, boolean[] values2, boolean consequentState)
  protected ToIntFunction<BuilderSupport> requireStringValueStoreParameter(String parameter, ValueStoreValidator.UseType useType)
  protected ToIntFunction<BuilderSupport> requireIntValueStoreParameter(String parameter, ValueStoreValidator.UseType useType)
  protected ToIntFunction<BuilderSupport> requireDoubleValueStoreParameter(String parameter, ValueStoreValidator.UseType useType)
  private void validateBooleanImplication(String[] attributes1, boolean[] values1, boolean antecedentState, String[] attributes2, boolean[] values2, boolean consequentState, boolean anyAntecedent)
  protected void provideFeature(Feature feature)
  protected void overrideParameters(String[] parameters, ParameterType types)
  protected void preventParameterOverride()
  private void provideFeatureOrParameters(ProviderEvaluator evaluator)
  protected void provideFeature(EnumSet<Feature> feature)
  protected void requireFeature(EnumSet<Feature> feature)
  protected void requireFeatureIf(String enumName, E targetValue, E enumValue, EnumSet<Feature> feature)
  protected void requireFeatureIf(String attribute, boolean requiredValue, boolean value, EnumSet<Feature> feature)
  protected void requireFeatureIf(BooleanHolder parameter, boolean requiredValue, EnumSet<Feature> feature)
  private boolean hasOverriddenParameter(String parameter, ParameterType type, FeatureEvaluatorHelper helper)
  private void validateOverriddenParameter(String parameter, ParameterType type, FeatureEvaluatorHelper helper)
  private void validateRequiresFeatureIf(String attribute, E requiredValue, E value, EnumSet<Feature> feature, FeatureEvaluatorHelper helper)
  private void validateRequiresFeatureIf(String attribute, boolean requiredValue, boolean value, EnumSet<Feature> feature, FeatureEvaluatorHelper helper)
  private void requireFeature(RequiredFeatureValidator validator)
  public static String[] getDescriptionArray(EnumSet<Feature> feature)
  private void resolveFeatureProviderReverences(BuilderManager manager)
  protected void registerStateSensor(String name, String subState, BiConsumer<Integer,Integer> setter)
  protected void registerStateSetter(String name, String subState, BiConsumer<Integer,Integer> setter)
  protected void registerStateRequirer(String name, String subState, BiConsumer<Integer,Integer> setter)
  protected void validateIsComponent()
  protected void requireStateString(JsonElement data, String name, boolean componentAllowed, TriConsumer<String,String,Boolean> setter, BuilderDescriptorState state, String shortDescription, String longDescription)
  protected boolean getExistentStateSet(JsonElement data, String name, Consumer<Int2ObjectMap<IntSet>> setter, StateMappingHelper stateHelper, BuilderDescriptorState state, String shortDescription, String longDescription)
  protected boolean getDefaultSubState(JsonElement data, String name, Consumer<String> setter, StringValidator validator, BuilderDescriptorState state, String shortDescription, String longDescription)
  protected void increaseDepth()
  protected void decreaseDepth()
  protected void setNotComponent()
  protected boolean isComponent()
  protected void requireInstructionType(EnumSet<InstructionType> instructionType)
  protected void requireContext(EnumSet<InstructionType> instructionType, EnumSet<ComponentContext> componentContexts)
  public IntSet getDependencies()
  public boolean validate(String configName, NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, List<String> errors)
  protected void runLoadTimeValidationHelper0(String configName, NPCLoadTimeValidationHelper loadTimeValidationHelper, ExecutionContext context, List<String> errors)
  private boolean runLoadTimeValidationHelper(String configName, NPCLoadTimeValidationHelper loadTimeValidationHelper, ExecutionContext context, List<String> errors)
  private boolean validateDynamicHolder(String configName, ValueHolder holder, ExecutionContext context, List<String> errors)
  private void trackDynamicHolder(ValueHolder holder)
  public static String readString(JsonObject object, String key)
  public static String readString(JsonObject jsonObject, String key, String defaultValue)
  public static boolean readBoolean(JsonObject jsonObject, String key, boolean defaultValue)
  public static JsonElement expectKey(JsonObject jsonObject, String key)
  public static String expectStringElement(JsonElement element, String key)
  public static boolean expectBooleanElement(JsonElement element, String key)
  public static JsonObject expectObject(JsonElement element)
  public static JsonObject expectObject(JsonElement element, String key)
  public static String[] readStringArray(JsonObject object, String key, StringValidator validator, String[] defaultValue)
  public static String[] readStringArray(JsonElement element, String key, StringValidator validator)
  protected void addError(String error)
  protected void addError(Exception e)

Fields:
private static final Pattern PATTERN
protected String fileName
protected Set<String> queriedKeys
protected boolean useDefaultsOnly
protected String label
protected String typeName
protected FeatureEvaluatorHelper evaluatorHelper
protected InternalReferenceResolver internalReferenceResolver
protected StateMappingHelper stateHelper
protected InstructionContextHelper instructionContextHelper
protected ExtraInfo extraInfo
protected List<Evaluator<?>> evaluators
protected BuilderValidationHelper validationHelper
protected BuilderDescriptor builderDescriptor
protected BuilderParameters builderParameters
protected BuilderManager builderManager
protected BuilderContext owner
protected List<String> readErrors
private List<ValueHolder> dynamicHolders
private List<ValueStoreValidator.ValueUsage> valueStoreUsages
protected ObjectSchema builderSchema
protected Schema builderSchemaRaw
protected SchemaContext builderSchemaContext
