# ChangeStatBaseInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server | Extends: com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInstantInteraction

public abstract class ChangeStatBaseInteraction extends SimpleInstantInteraction

Abstract base class for interactions that modify entity stats. Provides codec-driven configuration for stat modifiers, value types (absolute or percent), change behaviour, and the target entity. Concrete subclasses are ChangeStatInteraction and ChangeStatWithModifierInteraction.

## Codec Properties

- StatModifiers | Object2FloatMap<String> | Yes | -- | Modifiers to apply to EntityStats. Map keys must be valid `EntityStatType` asset IDs.
- ValueType | ValueType` enum | No | Absolute | Specifies if the StatModifiers are absolute values or percent. When using `Absolute`, `100` matches the max value.
- Behaviour | ChangeStatBehaviour | No | Add | Specifies how StatModifiers should be applied to the stats.
- Entity | InteractionTarget | Yes | USER | The entity to target for this interaction. Inherited from parent.

## Fields

- Object2FloatMap<String> entityStatAssets
- Int2FloatMap entityStats
- ValueType valueType
- ChangeStatBehaviour changeStatBehaviour
- InteractionTarget entityTarget

## Methods


@Nonnull
@Override
public String toString()

Returns a diagnostic string including all configured fields.

## Subclasses

- ChangeStatInteraction -- applies stat changes directly
- ChangeStatWithModifierInteraction -- applies stat changes with armor-based modifiers

## See Also

- `SimpleInstantInteraction` -- parent class
- `EntityStatsModule` -- resolves stat asset IDs to indices

Known subclasses: ChangeStatInteraction, ChangeStatWithModifierInteraction

Also in this package: AngledDamage, BlockEntityCustomPageSupplier, BlockSearchConsumer, ChangeStatInteraction, ChangeStatWithModifierInteraction, CheckUniqueItemUsageInteraction, ClearEntityEffectInteraction, CustomPageSupplier, DamageEntityInteraction, DoorInfo, DoorInteraction, DoorState, EntityStatOnHit, EquipItemInteraction, IncreaseBackpackCapacityInteraction, InterruptInteraction, LaunchPadInteraction, LaunchProjectileInteraction, ModifyInventoryInteraction, OpenContainerInteraction (and 11 more)

Complete API:
  public String toString()

Fields:
public static final BuilderCodec<ChangeStatBaseInteraction> CODEC
protected Object2FloatMap<String> entityStatAssets
protected Int2FloatMap entityStats
protected ValueType valueType
protected ChangeStatBehaviour changeStatBehaviour
protected InteractionTarget entityTarget
