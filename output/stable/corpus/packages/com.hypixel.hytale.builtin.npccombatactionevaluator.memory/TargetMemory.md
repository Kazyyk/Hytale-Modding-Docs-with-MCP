# TargetMemory

Type: class | Package: com.hypixel.hytale.builtin.npccombatactionevaluator.memory | Implements: Component<EntityStore>

public class TargetMemory implements Component<EntityStore>

## Fields

- @Nonnull private final Int2FloatOpenHashMap knownFriendlies
- @Nonnull private final List<Ref<EntityStore>> knownFriendliesList
- @Nonnull private final Int2FloatOpenHashMap knownHostiles
- @Nonnull private final List<Ref<EntityStore>> knownHostilesList
- private final float rememberFor
- @Nullable private Ref<EntityStore> closestHostile

## Constructors

- public TargetMemory(float rememberFor)

## Methods

- public static ComponentType<EntityStore, TargetMemory> getComponentType()
- @Nonnull public Int2FloatOpenHashMap getKnownFriendlies()
- @Nonnull public List<Ref<EntityStore>> getKnownFriendliesList()
- @Nonnull public Int2FloatOpenHashMap getKnownHostiles()
- @Nonnull public List<Ref<EntityStore>> getKnownHostilesList()
- public float getRememberFor()
- @Nullable public Ref<EntityStore> getClosestHostile()
- public void setClosestHostile(@Nullable Ref<EntityStore> ref)
- @Nonnull @Override public Component<EntityStore> clone()

Also in this package: CollectDamage, DamageMemory, DamageMemorySystems, TargetMemorySystems, Ticking

Complete API:
  public static ComponentType<EntityStore,TargetMemory> getComponentType()
  public Int2FloatOpenHashMap getKnownFriendlies()
  public List<Ref<EntityStore>> getKnownFriendliesList()
  public Int2FloatOpenHashMap getKnownHostiles()
  public List<Ref<EntityStore>> getKnownHostilesList()
  public float getRememberFor()
  public Ref<EntityStore> getClosestHostile()
  public void setClosestHostile(Ref<EntityStore> ref)
  public Component<EntityStore> clone()

Fields:
private final Int2FloatOpenHashMap knownFriendlies
private final List<Ref<EntityStore>> knownFriendliesList
private final Int2FloatOpenHashMap knownHostiles
private final List<Ref<EntityStore>> knownHostilesList
private final float rememberFor
private Ref<EntityStore> closestHostile
