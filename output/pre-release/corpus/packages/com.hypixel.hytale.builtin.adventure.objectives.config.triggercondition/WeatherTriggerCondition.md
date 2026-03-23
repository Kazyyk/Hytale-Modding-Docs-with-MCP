# WeatherTriggerCondition

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.config.triggercondition | Extends: ObjectiveLocationTriggerCondition

public class WeatherTriggerCondition extends ObjectiveLocationTriggerCondition

## Fields

- public static final BuilderCodec<WeatherTriggerCondition> CODEC
- protected static final ResourceType<EntityStore,WeatherResource> WEATHER_RESOURCE_RESOURCE_TYPE
- protected static final ComponentType<EntityStore,TransformComponent> TRANSFORM_COMPONENT_TYPE
- protected String[] weatherIds
- protected int[] weatherIndexes

## Methods

- @Override public boolean isConditionMet(ComponentAccessor<EntityStore> componentAccessor, Ref<EntityStore> ref, ObjectiveLocationMarker objectiveLocationMarker)
- @Nonnull @Override public String toString()

Also in this package: HourRangeTriggerCondition, ObjectiveLocationTriggerCondition

Complete API:
  public boolean isConditionMet(ComponentAccessor<EntityStore> componentAccessor, Ref<EntityStore> ref, ObjectiveLocationMarker objectiveLocationMarker)
  public String toString()

Fields:
public static final BuilderCodec<WeatherTriggerCondition> CODEC
protected static final ResourceType<EntityStore,WeatherResource> WEATHER_RESOURCE_RESOURCE_TYPE
protected static final ComponentType<EntityStore,TransformComponent> TRANSFORM_COMPONENT_TYPE
protected String[] weatherIds
protected int[] weatherIndexes
