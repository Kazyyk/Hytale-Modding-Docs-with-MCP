# MemoriesUnlockedPage

Type: class | Package: com.hypixel.hytale.builtin.adventure.memories.page | Extends: InteractiveCustomUIPage<MemoriesUnlockedPage.PageEventData>

public class MemoriesUnlockedPage extends InteractiveCustomUIPage<MemoriesUnlockedPage.PageEventData>

An informational UI page shown when accessing the memories system. Displays the `Pages/Memories/MemoriesUnlocked.ui` template and provides a button to navigate to the main MemoriesPage.

## Fields

- private final BlockPosition blockPosition

## Constructors

- public MemoriesUnlockedPage(@Nonnull PlayerRef playerRef, BlockPosition blockPosition)

## Methods

- public void build(@Nonnull Ref<EntityStore> ref, @Nonnull UICommandBuilder commandBuilder, @Nonnull UIEventBuilder eventBuilder, @Nonnull Store<EntityStore> store)
- public void handleDataEvent(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull MemoriesUnlockedPage.PageEventData data)

## Inner Types

- MemoriesUnlockedPage.PageAction -- enum with a single `DiscoverMemories` action
- MemoriesUnlockedPage.PageEventData -- codec-backed event data carrying the action
