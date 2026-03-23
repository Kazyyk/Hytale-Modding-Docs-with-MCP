# ComponentContext

Type: enum | Package: com.hypixel.hytale.server.npc.asset.builder | Implements: Supplier<String>

public enum ComponentContext implements Supplier<String>

Defines the sensor context in which a component operates within the NPC behavior tree. Used by InstructionContextHelper to validate that components are placed in appropriate sensor contexts.

## Constants

- SensorSelf | "self sensor"` -- the component operates in a self-sensing context.
- SensorTarget | "target sensor"` -- the component operates in a target-sensing context.
- SensorEntity | "entity sensor"` -- the component operates in an entity-sensing context.

## Static Fields

- NotSelfEntitySensor | EnumSet<ComponentContext> | Contains `SensorTarget` and `SensorEntity`.

## Methods

### get


public String get()

Returns the human-readable description string.

## Related Types

- InstructionContextHelper -- validates component context
- InstructionType -- the other context dimension

Also in this package: Builder, BuilderAssetMonitorHandler, BuilderAttributeDescriptor, BuilderBase, BuilderBaseWithType, BuilderCodecObjectHelper, BuilderCombatConfig, BuilderComponent, BuilderContext, BuilderDescriptor, BuilderDescriptorState, BuilderFactory, BuilderInfo, BuilderManager, BuilderModifier, BuilderObjectArrayHelper, BuilderObjectHelper, BuilderObjectListHelper, BuilderObjectMapHelper, BuilderObjectReferenceHelper (and 29 more)

Complete API:
  public String get()

Fields:
private final String description
public static final EnumSet<ComponentContext> NotSelfEntitySensor
