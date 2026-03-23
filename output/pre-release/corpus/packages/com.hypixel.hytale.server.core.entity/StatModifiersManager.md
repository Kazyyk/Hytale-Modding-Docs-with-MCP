# StatModifiersManager

Type: class | Package: com.hypixel.hytale.server.core.entity

public class StatModifiersManager

Manages equipment-based stat modifiers for a `LivingEntity`. Tracks which stats need recalculation via an `AtomicBoolean` flag and maintains a set of stats to clear. Processes armor inventory changes to apply/remove `StaticModifier` instances from the entity's `EntityStatMap`, and handles entity effect modifiers from equipped items.

Also in this package: AnimationUtils, CallState, ChainCancelledException, ChainSyncStorage, DefaultAnimations, Entity, EntitySnapshot, EntityUtils, ExplosionConfig, ExplosionUtils, Frozen, InteractionChain, InteractionContext, InteractionEntry, InteractionManager, ItemUtils, LivingEntity, SnapshotProvider, TempChain, UUIDComponent

Complete API:
  public void scheduleRecalculate()
  public void queueEntityStatsToClear(int[] entityStatsToClear)
  public void recalculateEntityStatModifiers(Ref<EntityStore> ref, EntityStatMap statMap, ComponentAccessor<EntityStore> componentAccessor)
  private static Int2ObjectOpenHashMap<Object2FloatMap<StaticModifier.CalculationType>> calculateEffectStatModifiers(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  private static void applyEffectModifiers(EntityStatMap statMap, Int2ObjectMap<Object2FloatMap<StaticModifier.CalculationType>> statModifiers)
  private static void computeStatModifiers(double brokenPenalty, Int2ObjectMap<Object2FloatMap<StaticModifier.CalculationType>> statModifiers, ItemStack itemInHand, Int2ObjectMap<StaticModifier[]> itemStatModifiers)
  private static Int2ObjectMap<Object2FloatMap<StaticModifier.CalculationType>> computeStatModifiers(BrokenPenalties brokenPenalties, ItemContainer armorContainer)
  private static void addArmorStatModifiers(ItemStack itemStack, double brokenPenalties, Int2ObjectOpenHashMap<Object2FloatMap<StaticModifier.CalculationType>> statModifiers)
  private static void addItemStatModifiers(ItemStack itemStack, EntityStatMap entityStatMap, String prefix, Function<Item,Int2ObjectMap<StaticModifier[]>> toStatModifiers)
  private static void clearAllStatModifiers(EntityStatMap.Predictable predictable, EntityStatMap entityStatMap, String prefix, Int2ObjectMap<StaticModifier[]> excluding)
  private static void clearStatModifiers(EntityStatMap.Predictable predictable, EntityStatMap entityStatMap, int statIndex, String prefix, int offset)
  private static void applyStatModifiers(EntityStatMap statMap, Int2ObjectMap<Object2FloatMap<StaticModifier.CalculationType>> statModifiers)

Fields:
private boolean recalculate
private final IntSet statsToClear
