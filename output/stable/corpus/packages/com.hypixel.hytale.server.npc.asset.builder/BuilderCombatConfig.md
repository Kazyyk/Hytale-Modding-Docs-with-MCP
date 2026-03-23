# BuilderCombatConfig

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder | Extends: BuilderCodecObjectHelper<String>

public class BuilderCombatConfig extends BuilderCodecObjectHelper<String>

A codec object helper specialized for NPC combat configuration. Reads a combat config reference (either inline JSON object or a string reference to a `BalanceAsset`) and supports runtime override via `ExecutionContext.getCombatConfig()`.

## Fields

- inline | boolean | Whether the config was provided as an inline JSON object rather than a string reference.

## Constructor


public BuilderCombatConfig(Codec<String> codec, Validator<String> validator)

## Methods

### build


public String build()

Throws `UnsupportedOperationException`. Use `build(ExecutionContext)` instead.


@Nullable
public String build(@Nonnull ExecutionContext context)

Returns the combat config string. If the execution context provides an override via `getCombatConfig()`, that value is used; otherwise the value read from JSON is returned.

### readConfig


@Override
public void readConfig(@Nonnull JsonElement data, @Nonnull ExtraInfo extraInfo)

Records whether the config is inline, then delegates to the parent codec reader.

### validate


public boolean validate(String configName, NPCLoadTimeValidationHelper loadTimeValidationHelper, @Nonnull ExecutionContext context, @Nonnull List<String> errors)

Validates that any override combat config string refers to an existing `BalanceAsset`.

## Related Types

- BuilderCodecObjectHelper -- parent class
- BuilderModifier -- can provide `_CombatConfig` overrides

Also in this package: Builder, BuilderAssetMonitorHandler, BuilderAttributeDescriptor, BuilderBase, BuilderBaseWithType, BuilderCodecObjectHelper, BuilderComponent, BuilderContext, BuilderDescriptor, BuilderDescriptorState, BuilderFactory, BuilderInfo, BuilderManager, BuilderModifier, BuilderObjectArrayHelper, BuilderObjectHelper, BuilderObjectListHelper, BuilderObjectMapHelper, BuilderObjectReferenceHelper, BuilderObjectStaticHelper (and 28 more)

Complete API:
  public String build()
  public void readConfig(JsonElement data, ExtraInfo extraInfo)
  public String build(ExecutionContext context)
  public boolean validate(String configName, NPCLoadTimeValidationHelper loadTimeValidationHelper, ExecutionContext context, List<String> errors)

Fields:
private boolean inline
