# FeatureOverride

Type: enum | Package: com.hypixel.hytale.server.npc.asset.builder | Implements: Supplier<String>

public enum FeatureOverride implements Supplier<String>

Three-state override for NPC builder features, allowing a feature to be forced on, forced off, or left at its default value.

## Enum Constants

- On | "Feature always enabled"
- Off | "Feature always disabled"
- Default | "Default behaviour"

## Methods

- get() | String | Returns the human-readable description of this override state.
- evaluate(boolean defaultValue) | boolean | Resolves the override: `On` returns `true`, `Off` returns `false`, `Default` returns the provided default.

Also in this package: Builder, BuilderAssetMonitorHandler, BuilderAttributeDescriptor, BuilderBase, BuilderBaseWithType, BuilderCodecObjectHelper, BuilderCombatConfig, BuilderComponent, BuilderContext, BuilderDescriptor, BuilderDescriptorState, BuilderFactory, BuilderInfo, BuilderManager, BuilderModifier, BuilderObjectArrayHelper, BuilderObjectHelper, BuilderObjectListHelper, BuilderObjectMapHelper, BuilderObjectReferenceHelper (and 29 more)

Complete API:
  public String get()
  public boolean evaluate(boolean defaultValue)

Fields:
private final String description
