# InteractionSimulationHandler

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction | Implements: IInteractionSimulationHandler

public class InteractionSimulationHandler implements IInteractionSimulationHandler

Default implementation of IInteractionSimulationHandler used for NPC/server-side interaction simulation. Tracks a simple boolean pressed state per `InteractionType`. Charging is considered active as long as the corresponding button is held down, and the charge value equals elapsed time.

## Instance Methods


@Override
public void setState(@Nonnull InteractionType type, boolean state)

Sets the pressed state for the given interaction type.


@Override
public boolean isCharging(boolean firstRun, float time, @Nonnull InteractionType type, InteractionContext context, Ref<EntityStore> ref, CooldownHandler cooldownHandler)

Returns `true` if the interaction type's button is currently held down.


@Override
public boolean shouldCancelCharging(boolean firstRun, float time, InteractionType type, InteractionContext context, Ref<EntityStore> ref, CooldownHandler cooldownHandler)

Always returns `false` -- simulation handlers never cancel charging.


@Override
public float getChargeValue(boolean firstRun, float time, InteractionType type, InteractionContext context, Ref<EntityStore> ref, CooldownHandler cooldownHandler)

Returns the elapsed time as the charge value.
