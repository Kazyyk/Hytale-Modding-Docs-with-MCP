# UUIDComponent

Type: class | Package: com.hypixel.hytale.server.core.entity | Implements: Component<EntityStore>

public final class UUIDComponent implements Component<EntityStore>

An `EntityStore` component that stores a `UUID` for an entity. Provides `getUuid()`, static factory methods `generateVersion3UUID()` and `randomUUID()`, and a codec with non-null validation. The UUID is auto-generated during decode if null.

Also in this package: AnimationUtils, CallState, ChainCancelledException, ChainSyncStorage, DefaultAnimations, Entity, EntitySnapshot, EntityUtils, ExplosionConfig, ExplosionUtils, Frozen, InteractionChain, InteractionContext, InteractionEntry, InteractionManager, ItemUtils, LivingEntity, SnapshotProvider, StatModifiersManager, TempChain

Complete API:
  public static ComponentType<EntityStore,UUIDComponent> getComponentType()
  public UUID getUuid()
  public Component<EntityStore> clone()
  public static UUIDComponent generateVersion3UUID()
  public static UUIDComponent randomUUID()

Fields:
public static final BuilderCodec<UUIDComponent> CODEC
private UUID uuid
