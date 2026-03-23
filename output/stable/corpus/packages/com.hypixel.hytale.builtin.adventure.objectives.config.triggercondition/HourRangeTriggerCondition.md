# HourRangeTriggerCondition

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.config.triggercondition | Extends: ObjectiveLocationTriggerCondition

public class HourRangeTriggerCondition extends ObjectiveLocationTriggerCondition

## Fields

- public static final BuilderCodec<HourRangeTriggerCondition> CODEC
- protected static final ResourceType<EntityStore,WorldTimeResource> WORLD_TIME_RESOURCE_RESOURCE_TYPE
- protected int minHour
- protected int maxHour

## Methods

- @Override public boolean isConditionMet(ComponentAccessor<EntityStore> componentAccessor, Ref<EntityStore> ref, ObjectiveLocationMarker objectiveLocationMarker)
- @Nonnull @Override public String toString()
