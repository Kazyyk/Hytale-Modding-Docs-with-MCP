# MemoriesPage

Type: class | Package: com.hypixel.hytale.builtin.adventure.memories.page | Extends: InteractiveCustomUIPage<MemoriesPage.PageEventData>

public class MemoriesPage extends InteractiveCustomUIPage<MemoriesPage.PageEventData>

Custom UI page for the memories collection system. Displays a category-based memories browser where players can view discovered and undiscovered memories organized by category, track overall progress via a progress bar, record newly gathered memories, and view individual memory details.

When no category is selected, builds the category panel showing all memory categories with progress counts and unlock indicators. When a category is selected, displays the memory grid for that category with selection support and a detail panel for the selected memory.

## Fields

- private String currentCategory
- private Memory selectedMemory
- private final Vector3d recordMemoriesParticlesPosition

## Constructors

- public MemoriesPage(@Nonnull PlayerRef playerRef, @Nonnull BlockPosition blockPosition)

## Methods

- public void build(@Nonnull Ref<EntityStore> ref, @Nonnull UICommandBuilder commandBuilder, @Nonnull UIEventBuilder eventBuilder, @Nonnull Store<EntityStore> store)
- private static void buildChestMarkers(@Nonnull UICommandBuilder commandBuilder, @Nonnull GameplayConfig gameplayConfig, int totalMemories)
- public void handleDataEvent(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull MemoriesPage.PageEventData data)
- private static void updateMemoryButtonSelection(@Nonnull UICommandBuilder commandBuilder, int index, @Nonnull Memory memory, boolean isSelected)
- private static void updateMemoryDetailsPanel(@Nonnull UICommandBuilder commandBuilder, @Nonnull Memory memory)

## Inner Types

- MemoriesPage.PageAction -- enum of UI actions (Record, ViewCategory, Back, MemoriesInfo, SelectMemory)
- MemoriesPage.PageEventData -- codec-backed event data carrying action, category, and memory ID
