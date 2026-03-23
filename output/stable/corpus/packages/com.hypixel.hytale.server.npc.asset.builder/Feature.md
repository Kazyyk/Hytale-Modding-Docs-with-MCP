# Feature

Type: enum | Package: com.hypixel.hytale.server.npc.asset.builder | Implements: Supplier<String>

public enum Feature implements Supplier<String>

Defines the features (target types and capabilities) that NPC builders can require or provide. Used by the feature evaluator system to ensure that actions and motions have access to the target types they need.

## Constants

- Player | "player target"` -- requires a player target.
- NPC | "NPC target"` -- requires an NPC target.
- Drop | "dropped item target"` -- requires a dropped item target.
- Position | "vector position"` -- requires a position vector.
- Path | "path"` -- requires a navigation path.

## Static Fields

- AnyPosition | EnumSet<Feature> | Player, NPC, Drop, Position
- AnyEntity | EnumSet<Feature> | Player, NPC, Drop
- LiveEntity | EnumSet<Feature> | Player, NPC

## Methods

### get


public String get()

Returns the human-readable description.

## Related Types

- FeatureEvaluatorHelper -- evaluates feature requirements

Also in this package: Builder, BuilderAssetMonitorHandler, BuilderAttributeDescriptor, BuilderBase, BuilderBaseWithType, BuilderCodecObjectHelper, BuilderCombatConfig, BuilderComponent, BuilderContext, BuilderDescriptor, BuilderDescriptorState, BuilderFactory, BuilderInfo, BuilderManager, BuilderModifier, BuilderObjectArrayHelper, BuilderObjectHelper, BuilderObjectListHelper, BuilderObjectMapHelper, BuilderObjectReferenceHelper (and 28 more)

Complete API:
  public String get()

Fields:
private final String description
public static final EnumSet<Feature> AnyPosition
public static final EnumSet<Feature> AnyEntity
public static final EnumSet<Feature> LiveEntity
