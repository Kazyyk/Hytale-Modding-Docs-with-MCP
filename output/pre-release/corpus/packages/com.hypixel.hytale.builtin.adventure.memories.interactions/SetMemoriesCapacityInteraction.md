# SetMemoriesCapacityInteraction

Type: class | Package: com.hypixel.hytale.builtin.adventure.memories.interactions | Extends: SimpleInstantInteraction

public class SetMemoriesCapacityInteraction extends SimpleInstantInteraction

## Fields

- @Nonnull private static final String NOTIFICATION_ICON_MEMORIES
- @Nonnull private static final Message MESSAGE_SERVER_MEMORIES_GENERAL_FEATURE_UNLOCKED_NOTIFICATION
- @Nonnull private static final Message MESSAGE_SERVER_MEMORIES_GENERAL_FEATURE_UNLOCKED_MESSAGE
- @Nonnull public static final BuilderCodec<SetMemoriesCapacityInteraction> CODEC
- private int capacity

## Methods

- @Override protected void firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)
- @Nonnull @Override public WaitForDataFrom getWaitForDataFrom()
- @Override public String toString()

Also in this package: MemoriesConditionInteraction, MemoriesTag

Complete API:
  protected void firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  public WaitForDataFrom getWaitForDataFrom()
  public String toString()

Fields:
private static final String NOTIFICATION_ICON_MEMORIES
private static final Message MESSAGE_SERVER_MEMORIES_GENERAL_FEATURE_UNLOCKED_NOTIFICATION
private static final Message MESSAGE_SERVER_MEMORIES_GENERAL_FEATURE_UNLOCKED_MESSAGE
public static final BuilderCodec<SetMemoriesCapacityInteraction> CODEC
private int capacity
