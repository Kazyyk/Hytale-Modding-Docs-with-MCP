# DeployableOwnerComponent

Type: class | Package: com.hypixel.hytale.builtin.deployables.component | Implements: Component<EntityStore>

public class DeployableOwnerComponent implements Component<EntityStore>

## Fields

- @Nonnull private final List<Pair<String, Ref<EntityStore>>> deployables
- @Nonnull private final Object2IntMap<String> deployableCountPerId
- @Nonnull private final List<Ref<EntityStore>> deployablesForDestruction
- @Nonnull private final List<Pair<String, Ref<EntityStore>>> tempDestructionList

## Methods

- @Nonnull public static ComponentType<EntityStore, DeployableOwnerComponent> getComponentType()
- private static int getMaxDeployablesForId(@Nonnull DeployableComponent comp)
- private static int getMaxDeployablesGlobal(@Nonnull Store<EntityStore> store)
- public void tick(@Nonnull CommandBuffer<EntityStore> commandBuffer)
- public void registerDeployable(@Nonnull Ref<EntityStore> owner,
        @Nonnull DeployableComponent deployableComp,
        @Nonnull String id,
        @Nonnull Ref<EntityStore> deployable,
        @Nonnull Store<EntityStore> store)` |
| `public` | `void` | `deRegisterDeployable(@Nonnull String id, @Nonnull Ref<EntityStore> deployable)` |
| `private` | `void` | `incrementId(@Nonnull String id)` |
| `private` | `void` | `decrementId(@Nonnull String id)` |
| `private` | `int` | `getCurrentDeployablesById(@Nonnull String id)` |
| `private` | `void` | `handlePerDeployableLimit(@Nonnull String id, @Nonnull DeployableComponent deployableComponent)` |
| `private` | `void` | `handleGlobalDeployableLimit(@Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> owner)` |
| `private` | `void` | `handleOverMaxDeployableDestruction(@Nonnull CommandBuffer<EntityStore> commandBuffer)` |
| `@Override public` | `Component<EntityStore>` | `clone()` |

Also in this package: DeployableComponent, DeployableFlag, DeployableProjectileComponent, DeployableProjectileShooterComponent

Complete API:
  public static ComponentType<EntityStore,DeployableOwnerComponent> getComponentType()
  private static int getMaxDeployablesForId(DeployableComponent comp)
  private static int getMaxDeployablesGlobal(Store<EntityStore> store)
  public void tick(CommandBuffer<EntityStore> commandBuffer)
  public void registerDeployable(Ref<EntityStore> owner, DeployableComponent deployableComp, String id, Ref<EntityStore> deployable, Store<EntityStore> store)
  public void deRegisterDeployable(String id, Ref<EntityStore> deployable)
  private void incrementId(String id)
  private void decrementId(String id)
  private int getCurrentDeployablesById(String id)
  private void handlePerDeployableLimit(String id, DeployableComponent deployableComponent)
  private void handleGlobalDeployableLimit(Store<EntityStore> store, Ref<EntityStore> owner)
  private void handleOverMaxDeployableDestruction(CommandBuffer<EntityStore> commandBuffer)
  public Component<EntityStore> clone()

Fields:
private final List<Pair<String,Ref<EntityStore>>> deployables
private final Object2IntMap<String> deployableCountPerId
private final List<Ref<EntityStore>> deployablesForDestruction
private final List<Pair<String,Ref<EntityStore>>> tempDestructionList
