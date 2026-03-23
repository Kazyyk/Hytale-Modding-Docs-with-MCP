# NPCInteractionSimulationHandler

Type: class | Package: com.hypixel.hytale.server.npc.interactions | Implements: IInteractionSimulationHandler

public class NPCInteractionSimulationHandler implements IInteractionSimulationHandler

## Fields

- private float requestedChargeTime

## Methods

- public void setState(InteractionType type, boolean state)
- public boolean isCharging( boolean firstRun, float time, InteractionType type, InteractionContext context, Ref<EntityStore> ref, CooldownHandler cooldownHandler )
- public boolean shouldCancelCharging( boolean firstRun, float time, InteractionType type, InteractionContext context, Ref<EntityStore> ref, CooldownHandler cooldownHandler )
- public float getChargeValue( boolean firstRun, float time, InteractionType type, InteractionContext context, Ref<EntityStore> ref, CooldownHandler cooldownHandler )
- public void requestChargeTime(float chargeTime)
