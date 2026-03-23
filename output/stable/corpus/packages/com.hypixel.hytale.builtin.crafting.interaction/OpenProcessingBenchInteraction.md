# OpenProcessingBenchInteraction

Type: class | Package: com.hypixel.hytale.builtin.crafting.interaction | Extends: SimpleBlockInteraction

public class OpenProcessingBenchInteraction extends SimpleBlockInteraction

Block or entity interaction handler for OpenProcessingBench behavior.

## Methods

- @Override protected void interactWithBlock(@Nonnull World world,
        @Nonnull CommandBuffer<EntityStore> commandBuffer,
        @Nonnull InteractionType type,
        @Nonnull InteractionContext context,
        @Nullable ItemStack itemInHand,
        @Nonnull Vector3i pos,
        @Nonnull CooldownHandler cooldownHandler)` |
| `@Override protected` | `void` | `simulateInteractWithBlock(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nullable ItemStack itemInHand, @Nonnull World world, @Nonnull Vector3i targetBlock)` |

Also in this package: LearnRecipeInteraction, OpenBenchPageInteraction, PageType

Complete API:
  protected void interactWithBlock(World world, CommandBuffer<EntityStore> commandBuffer, InteractionType type, InteractionContext context, ItemStack itemInHand, Vector3i pos, CooldownHandler cooldownHandler)
  protected void simulateInteractWithBlock(InteractionType type, InteractionContext context, ItemStack itemInHand, World world, Vector3i targetBlock)

Fields:
public static final BuilderCodec<OpenProcessingBenchInteraction> CODEC
