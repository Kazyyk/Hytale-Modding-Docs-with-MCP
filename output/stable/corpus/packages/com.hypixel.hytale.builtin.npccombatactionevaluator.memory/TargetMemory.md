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
