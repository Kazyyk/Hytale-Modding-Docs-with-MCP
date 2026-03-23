# SpawnMinecartInteraction

Type: class | Package: com.hypixel.hytale.builtin.mounts.interactions | Extends: SimpleBlockInteraction

public class SpawnMinecartInteraction extends SimpleBlockInteraction

## Fields

- public static final BuilderCodec<SpawnMinecartInteraction> CODEC
- private String modelId
- private Map<InteractionType, String> cartInteractions

## Methods

- @Override protected void interactWithBlock(@Nonnull World world,
        @Nonnull CommandBuffer<EntityStore> commandBuffer,
        @Nonnull InteractionType type,
        @Nonnull InteractionContext context,
        @Nullable ItemStack itemInHand,
        @Nonnull Vector3i targetBlock,
        @Nonnull CooldownHandler cooldownHandler)` |
| `@Override protected` | `void` | `simulateInteractWithBlock(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nullable ItemStack itemInHand, @Nonnull World world, @Nonnull Vector3i targetBlock)` |
| `private static` | `void` | `alignToRail(@Nonnull Vector3i targetBlock, @Nonnull Vector3d target, @Nonnull Vector3f rotation, float yaw, @Nonnull RailConfig config)` |

Also in this package: MountInteraction, SeatingInteraction

Complete API:
  protected void interactWithBlock(World world, CommandBuffer<EntityStore> commandBuffer, InteractionType type, InteractionContext context, ItemStack itemInHand, Vector3i targetBlock, CooldownHandler cooldownHandler)
  protected void simulateInteractWithBlock(InteractionType type, InteractionContext context, ItemStack itemInHand, World world, Vector3i targetBlock)
  private static void alignToRail(Vector3i targetBlock, Vector3d target, Vector3f rotation, float yaw, RailConfig config)

Fields:
public static final BuilderCodec<SpawnMinecartInteraction> CODEC
private String modelId
private Map<InteractionType,String> cartInteractions
