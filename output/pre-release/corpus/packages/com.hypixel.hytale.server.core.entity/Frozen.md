# Frozen

Type: class | Package: com.hypixel.hytale.server.core.entity | Implements: Component<EntityStore>

public class Frozen implements Component<EntityStore>

Singleton marker `EntityStore` component indicating that an entity is frozen (immobilized). Uses a private constructor with a static `INSTANCE` and `get()` accessor. The `clone()` method returns the same singleton instance.

Also in this package: AnimationUtils, CallState, ChainCancelledException, ChainSyncStorage, DefaultAnimations, Entity, EntitySnapshot, EntityUtils, ExplosionConfig, ExplosionUtils, InteractionChain, InteractionContext, InteractionEntry, InteractionManager, ItemUtils, LivingEntity, SnapshotProvider, StatModifiersManager, TempChain, UUIDComponent

Complete API:
  public static ComponentType<EntityStore,Frozen> getComponentType()
  public static Frozen get()
  public Component<EntityStore> clone()

Fields:
public static final BuilderCodec<Frozen> CODEC
private static final Frozen INSTANCE
