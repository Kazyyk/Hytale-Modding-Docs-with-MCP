# MemoriesConditionInteraction

Type: class | Package: com.hypixel.hytale.builtin.adventure.memories.interactions | Extends: Interaction

public class MemoriesConditionInteraction extends Interaction

## Fields

- @Nonnull private static final StringTag TAG_FAILED
- @Nonnull private Int2ObjectMap<String> next
- private transient int[] sortedKeys
- @Nonnull private final Int2IntOpenHashMap levelToLabel
- @Nullable private String failed

## Methods

- @Override protected void tick0(boolean firstRun, float time, @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)
- @Override protected void simulateTick0(boolean firstRun, float time, @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)
- @Override public void compile(@Nonnull OperationsBuilder builder)
- @Nonnull @Override protected com.hypixel.hytale.protocol.Interaction generatePacket()
- @Override protected void configurePacket(@Nonnull com.hypixel.hytale.protocol.Interaction packet)
- @Override public boolean walk(@Nonnull Collector collector, @Nonnull InteractionContext context)
- @Override public boolean needsRemoteSync()
- @Nonnull @Override public WaitForDataFrom getWaitForDataFrom()

## Inner Types

- `MemoriesConditionInteraction.MemoriesTag`
