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

Also in this package: LearnRecipeInteraction, OpenProcessingBenchInteraction, PageType

Complete API:
  protected void interactWithBlock(World world, CommandBuffer<EntityStore> commandBuffer, InteractionType type, InteractionContext context, ItemStack itemInHand, Vector3i targetBlock, CooldownHandler cooldownHandler)
  protected void simulateInteractWithBlock(InteractionType type, InteractionContext context, ItemStack itemInHand, World world, Vector3i targetBlock)

Fields:
public static final OpenBenchPageInteraction SIMPLE_CRAFTING
public static final RootInteraction SIMPLE_CRAFTING_ROOT
public static final OpenBenchPageInteraction DIAGRAM_CRAFTING
public static final RootInteraction DIAGRAM_CRAFTING_ROOT
public static final OpenBenchPageInteraction STRUCTURAL_CRAFTING
public static final RootInteraction STRUCTURAL_CRAFTING_ROOT
public static final BuilderCodec<OpenBenchPageInteraction> CODEC
private OpenBenchPageInteraction.PageType pageType
