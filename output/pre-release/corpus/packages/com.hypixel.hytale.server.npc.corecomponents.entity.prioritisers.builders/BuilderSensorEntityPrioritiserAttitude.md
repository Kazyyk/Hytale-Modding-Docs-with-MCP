# BuilderSensorEntityPrioritiserAttitude

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.prioritisers.builders | Extends: BuilderSensorEntityPrioritiserBase

public class BuilderSensorEntityPrioritiserAttitude extends BuilderSensorEntityPrioritiserBase

Utility type in the `builders` subsystem.

## Accessors

- getShortDescription() | String | Accessor method.
- getLongDescription() | String | Accessor method.
- getBuilderDescriptorState() | BuilderDescriptorState | Accessor method.
- getPrioritisedAttitudes(BuilderSupport support) | Attitude[] | Accessor method.

## Methods

- build(BuilderSupport builderSupport) | SensorEntityPrioritiserAttitude | Instance method.
- readConfig(JsonElement data) | BuilderSensorEntityPrioritiserAttitude | Instance method.

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public SensorEntityPrioritiserAttitude build(BuilderSupport builderSupport)
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderSensorEntityPrioritiserAttitude readConfig(JsonElement data)
  public Attitude[] getPrioritisedAttitudes(BuilderSupport support)

Fields:
protected final EnumArrayHolder<Attitude> prioritisedAttitudes
