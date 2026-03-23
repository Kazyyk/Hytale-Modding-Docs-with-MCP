# IInteractionSimulationHandler

Type: interface | Package: com.hypixel.hytale.server.core.modules.interaction

public interface IInteractionSimulationHandler

Interface for controlling how interactions are simulated on the server side (for NPCs) or predicted on the client side. Provides methods for setting button state, querying charge status, and computing charge values. The default implementation is InteractionSimulationHandler.

## Methods


void setState(InteractionType var1, boolean var2)

Sets the pressed state for an interaction type.


boolean isCharging(boolean var1, float var2, InteractionType var3, InteractionContext var4, Ref<EntityStore> var5, CooldownHandler var6)

Returns whether the given interaction type is currently in a charging state.


boolean shouldCancelCharging(boolean var1, float var2, InteractionType var3, InteractionContext var4, Ref<EntityStore> var5, CooldownHandler var6)

Returns whether an in-progress charge should be cancelled.


float getChargeValue(boolean var1, float var2, InteractionType var3, InteractionContext var4, Ref<EntityStore> var5, CooldownHandler var6)

Returns the current charge progress value.
