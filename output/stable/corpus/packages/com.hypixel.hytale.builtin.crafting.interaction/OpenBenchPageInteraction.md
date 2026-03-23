# OpenBenchPageInteraction

Type: class | Package: com.hypixel.hytale.builtin.crafting.interaction | Extends: SimpleBlockInteraction

public class OpenBenchPageInteraction extends SimpleBlockInteraction

Block or entity interaction handler for OpenBenchPage behavior.

## Constants

- @Nonnull public static final RootInteraction SIMPLE_CRAFTING_ROOT
- @Nonnull public static final RootInteraction DIAGRAM_CRAFTING_ROOT
- @Nonnull public static final RootInteraction STRUCTURAL_CRAFTING_ROOT

## Fields

- @Nonnull private OpenBenchPageInteraction.PageType pageType

## Methods

- public OpenBenchPageInteraction(@Nonnull String id, @Nonnull OpenBenchPageInteraction.PageType pageType)
- protected OpenBenchPageInteraction()
- @Override protected void interactWithBlock(@Nonnull World world,
        @Nonnull CommandBuffer<EntityStore> commandBuffer,
        @Nonnull InteractionType type,
        @Nonnull InteractionContext context,
        @Nullable ItemStack itemInHand,
        @Nonnull Vector3i targetBlock,
        @Nonnull CooldownHandler cooldownHandler)` |
| `@Override protected` | `void` | `simulateInteractWithBlock(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nullable ItemStack itemInHand, @Nonnull World world, @Nonnull Vector3i targetBlock)` |
