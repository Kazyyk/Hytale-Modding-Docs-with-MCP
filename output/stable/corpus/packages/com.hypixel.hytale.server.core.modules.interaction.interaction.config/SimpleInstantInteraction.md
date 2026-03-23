# SimpleInstantInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config | Extends: SimpleInteraction

public abstract class SimpleInstantInteraction extends SimpleInteraction

Abstract interaction that executes its logic on the first tick only, then completes immediately.

## Constants

- BuilderCodec<SimpleInstantInteraction> CODEC

## Key Methods

- protected final void tick0(boolean firstRun, float time, @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)
- protected void simulateTick0(boolean firstRun, float time, @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)
- protected abstract void firstRun(@Nonnull InteractionType var1, @Nonnull InteractionContext var2, @Nonnull CooldownHandler var3)
- protected void simulateFirstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)
- public String toString()
