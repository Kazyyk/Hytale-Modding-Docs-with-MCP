# DeployableComponent

Type: class | Package: com.hypixel.hytale.builtin.deployables.component | Implements: Component<EntityStore>

public class DeployableComponent implements Component<EntityStore>

## Fields

- @Nonnull private final Map<DeployableComponent.DeployableFlag, Integer> flags
- private DeployableConfig config
- private Ref<EntityStore> owner
- private UUID ownerUUID
- private Instant spawnInstant
- private float timeSinceLastAttack
- @Nullable private Vector3f debugColor
- private boolean firstTickRan
- private String spawnFace

## Methods

- @Nonnull public static ComponentType<EntityStore, DeployableComponent> getComponentType()
- @Override public Component<EntityStore> clone()
- public void tick(float dt,
        int index,
        @Nonnull ArchetypeChunk<EntityStore> archetypeChunk,
        @Nonnull Store<EntityStore> store,
        @Nonnull CommandBuffer<EntityStore> commandBuffer)` |
| `public` | `void` | `init(@Nonnull Ref<EntityStore> deployerRef,
        @Nonnull Store<EntityStore> store,
        @Nonnull DeployableConfig config,
        @Nonnull Instant spawnInstant,
        @Nonnull String spawnFace)` |
| `public` | `Ref<EntityStore>` | `getOwner()` |
| `public` | `UUID` | `getOwnerUUID()` |
| `public` | `DeployableConfig` | `getConfig()` |
| `public` | `Instant` | `getSpawnInstant()` |
| `public` | `float` | `getTimeSinceLastAttack()` |
| `public` | `void` | `setTimeSinceLastAttack(float time)` |
| `public` | `float` | `incrementTimeSinceLastAttack(float time)` |
| `public` | `String` | `getSpawnFace()` |
| `public` | `int` | `getFlag(@Nonnull DeployableComponent.DeployableFlag key)` |
| `public` | `void` | `setFlag(@Nonnull DeployableComponent.DeployableFlag key, int value)` |
| `@Nonnull public` | `Vector3f` | `getDebugColor()` |

## Inner Types

- `DeployableComponent.DeployableFlag`

Also in this package: DeployableFlag, DeployableOwnerComponent, DeployableProjectileComponent, DeployableProjectileShooterComponent

Complete API:
  public static ComponentType<EntityStore,DeployableComponent> getComponentType()
  public Component<EntityStore> clone()
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public void init(Ref<EntityStore> deployerRef, Store<EntityStore> store, DeployableConfig config, Instant spawnInstant, String spawnFace)
  public Ref<EntityStore> getOwner()
  public UUID getOwnerUUID()
  public DeployableConfig getConfig()
  public Instant getSpawnInstant()
  public float getTimeSinceLastAttack()
  public void setTimeSinceLastAttack(float time)
  public float incrementTimeSinceLastAttack(float time)
  public String getSpawnFace()
  public int getFlag(DeployableComponent.DeployableFlag key)
  public void setFlag(DeployableComponent.DeployableFlag key, int value)
  public Vector3f getDebugColor()

Fields:
private final Map<DeployableComponent.DeployableFlag,Integer> flags
private DeployableConfig config
private Ref<EntityStore> owner
private UUID ownerUUID
private Instant spawnInstant
private float timeSinceLastAttack
private Vector3f debugColor
private boolean firstTickRan
private String spawnFace
