# BuilderAttributeDescriptor

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder

public class BuilderAttributeDescriptor

Describes a single attribute within a BuilderDescriptor. Each attribute has a name, type string, lifecycle state, descriptions, and optional metadata such as requirement level, default value, domain constraints, array length bounds, and a `Validator`. Uses a fluent API for configuration.

## Inner Types

### RequirementType (enum)


private static enum RequirementType

- REQUIRED | The attribute must be present.
- OPTIONAL | The attribute may be omitted; a default value applies.
- REQUIRED_IF_NOT_OVERRIDDEN | Required unless a parent builder provides it.

## Constructor


public BuilderAttributeDescriptor(String name, String type, BuilderDescriptorState state, String shortDescription, String longDescription)

Creates an attribute descriptor. Defaults to `OPTIONAL` requirement, not computable, no default value, no domain, no validator, and no size constraints.

## Fields

- name | String | Attribute name as it appears in JSON.
- type | String | Type description string (e.g., "double", "string", "enum").
- required | RequirementType | Whether the attribute is required.
- computable | boolean | Whether the value can be an expression.
- state | BuilderDescriptorState | Lifecycle state of the attribute.
- shortDescription | String | Brief description of the attribute.
- longDescription | String | Detailed description of the attribute.
- defaultValue | String | String representation of the default value, if any.
- domain | String | Constraint domain string (e.g., enum values).
- minSize` / `maxSize | int | Array length bounds. `-1` means unconstrained.
- validator | Validator | Optional validator for the attribute's value.
- flagDescriptions | Map<String, String> | Enum flag names mapped to descriptions.

## Fluent Configuration Methods


@Nonnull
public BuilderAttributeDescriptor required()

Marks the attribute as required and clears any default value.


@Nonnull
public BuilderAttributeDescriptor requiredIfNotOverridden()

Marks the attribute as required unless overridden by a parent builder.


@Nonnull
public BuilderAttributeDescriptor optional(String defaultValue)

Marks the attribute as optional with the given default value. Overloaded for `double[]`, `int[]`, `String[]`, and `boolean[]`.


@Nonnull
public BuilderAttributeDescriptor computable()

Marks the attribute as supporting expression evaluation.


@Nonnull
public <E extends Enum<E>> BuilderAttributeDescriptor setBasicEnum(@Nonnull Class<E> clazz)

Sets the domain from enum constants. Uses `toString()` for both name and description.


@Nonnull
public <E extends Enum<E> & Supplier<String>> BuilderAttributeDescriptor setEnum(@Nonnull Class<E> clazz)

Sets the domain from enum constants. Uses `toString()` for the name and `get()` for the description.


@Nonnull
public BuilderAttributeDescriptor domain(String domain)

Sets an explicit domain constraint string.


@Nonnull
public BuilderAttributeDescriptor validator(Validator validator)

Attaches a validator to this attribute.


@Nonnull
public BuilderAttributeDescriptor length(int size)

Sets both min and max array length to the given size.


@Nonnull
public BuilderAttributeDescriptor length(int minSize, int maxSize)

Sets the minimum and maximum array length bounds.

## Related Types

- BuilderDescriptor -- contains a list of these attribute descriptors
- BuilderDescriptorState -- lifecycle state enum
- BuilderBase -- uses attribute descriptors during schema generation

Also in this package: Builder, BuilderAssetMonitorHandler, BuilderBase, BuilderBaseWithType, BuilderCodecObjectHelper, BuilderCombatConfig, BuilderComponent, BuilderContext, BuilderDescriptor, BuilderDescriptorState, BuilderFactory, BuilderInfo, BuilderManager, BuilderModifier, BuilderObjectArrayHelper, BuilderObjectHelper, BuilderObjectListHelper, BuilderObjectMapHelper, BuilderObjectReferenceHelper, BuilderObjectStaticHelper (and 29 more)

Complete API:
  public BuilderAttributeDescriptor required()
  public BuilderAttributeDescriptor requiredIfNotOverridden()
  public BuilderAttributeDescriptor optional(String defaultValue)
  public BuilderAttributeDescriptor optional(double[] defaultValue)
  public BuilderAttributeDescriptor optional(int[] defaultValue)
  public BuilderAttributeDescriptor optional(String[] defaultValue)
  public BuilderAttributeDescriptor optional(boolean[] defaultValue)
  public BuilderAttributeDescriptor computable()
  public BuilderAttributeDescriptor setBasicEnum(Class<E> clazz)
  public BuilderAttributeDescriptor setEnum(Class<E> clazz)
  public BuilderAttributeDescriptor domain(String domain)
  public BuilderAttributeDescriptor validator(Validator validator)
  public BuilderAttributeDescriptor length(int size)
  public BuilderAttributeDescriptor length(int minSize, int maxSize)
  public String toString()

Fields:
private final String name
private final String type
private BuilderAttributeDescriptor.RequirementType required
private boolean computable
private final BuilderDescriptorState state
private final String shortDescription
private final String longDescription
private String defaultValue
private String domain
private int minSize
private int maxSize
private Validator validator
private Map<String,String> flagDescriptions
