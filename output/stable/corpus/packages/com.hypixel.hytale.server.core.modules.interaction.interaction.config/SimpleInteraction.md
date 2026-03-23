# SimpleInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config | Extends: Interaction

public class SimpleInteraction extends Interaction

Basic interaction with optional next/failed branching. Extends Interaction with compile-time operation graph construction.

## Constants

- BuilderCodec<SimpleInteraction> CODEC

## Key Methods

- public WaitForDataFrom getWaitForDataFrom()
- protected void tick0(boolean firstRun, float time, @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)
- protected void simulateTick0(boolean firstRun, float time, @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)
- public void compile(@Nonnull OperationsBuilder builder)
- public boolean walk(@Nonnull Collector collector, @Nonnull InteractionContext context)
- protected com.hypixel.hytale.protocol.Interaction generatePacket()
- protected void configurePacket(com.hypixel.hytale.protocol.Interaction packet)
- public boolean needsRemoteSync()
- public String toString()
