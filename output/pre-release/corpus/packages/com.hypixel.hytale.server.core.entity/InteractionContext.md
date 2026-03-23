# InteractionContext

Type: class | Package: com.hypixel.hytale.server.core.entity

public class InteractionContext

Holds the full runtime context for an interaction chain execution. Tracks the held item (section ID, container, slot, stack), the owning and running-for entity references, the interaction manager, the current chain and entry, jump labels, a snapshot provider, and a `DynamicMetaStore` for interaction metadata. Provides methods for duplicating context, forking chains, and accessing interaction variables.

Also in this package: AnimationUtils, CallState, ChainCancelledException, ChainSyncStorage, DefaultAnimations, Entity, EntitySnapshot, EntityUtils, ExplosionConfig, ExplosionUtils, Frozen, InteractionChain, InteractionEntry, InteractionManager, ItemUtils, LivingEntity, SnapshotProvider, StatModifiersManager, TempChain, UUIDComponent

Complete API:
  public InteractionChain fork(InteractionContext context, RootInteraction rootInteraction, boolean predicted)
  public InteractionChain fork(InteractionType type, InteractionContext context, RootInteraction rootInteraction, boolean predicted)
  public InteractionChain fork(InteractionChainData data, InteractionType type, InteractionContext context, RootInteraction rootInteraction, boolean predicted)
  public InteractionContext duplicate()
  public Ref<EntityStore> getEntity()
  public Ref<EntityStore> getOwningEntity()
  public void execute(RootInteraction nextInteraction)
  public InteractionChain getChain()
  public InteractionEntry getEntry()
  public int getOperationCounter()
  public void setOperationCounter(int operationCounter)
  public void jump(Label label)
  public Item getOriginalItemType()
  public int getHeldItemSectionId()
  public ItemContainer getHeldItemContainer()
  public byte getHeldItemSlot()
  public ItemStack getHeldItem()
  public void setHeldItem(ItemStack heldItem)
  public ItemContext createHeldItemContext()
  public Function<InteractionContext,Map<String,String>> getInteractionVarsGetter()
  public Map<String,String> getInteractionVars()
  public void setInteractionVarsGetter(Function<InteractionContext,Map<String,String>> interactionVarsGetter)
  public InteractionManager getInteractionManager()
  public Ref<EntityStore> getTargetEntity()
  public BlockPosition getTargetBlock()
  public DynamicMetaStore<InteractionContext> getMetaStore()
  public InteractionSyncData getState()
  public InteractionSyncData getClientState()
  public InteractionSyncData getServerState()
  public DynamicMetaStore<Interaction> getInstanceStore()
  public boolean allowSkipChainOnClick()
  public void setLabels(Label[] labels)
  public boolean hasLabels()
  public Label getLabel(int index)
  public EntitySnapshot getSnapshot(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public void setSnapshotProvider(InteractionContext.SnapshotProvider snapshotProvider)
  public void setTimeShift(float shift)
  public CommandBuffer<EntityStore> getCommandBuffer()
  public String getRootInteractionId(InteractionType type)
  void initEntry(InteractionChain chain, InteractionEntry entry, LivingEntity entity)
  void deinitEntry(InteractionChain chain, InteractionEntry entry, LivingEntity entity)
  public String toString()
  public static InteractionContext forProxyEntity(InteractionManager manager, Ref<EntityStore> entityRef, Ref<EntityStore> runningForEntity, ComponentAccessor<EntityStore> componentAccessor)
  public static InteractionContext forInteraction(InteractionManager manager, Ref<EntityStore> ref, InteractionType type, ComponentAccessor<EntityStore> componentAccessor)
  public static InteractionContext forInteraction(InteractionManager manager, Ref<EntityStore> ref, InteractionType type, int equipSlot, ComponentAccessor<EntityStore> componentAccessor)
  public static InteractionContext withoutEntity()
  private static Map<String,String> defaultGetVars(InteractionContext c)

Fields:
private static final Function<InteractionContext,Map<String,String>> DEFAULT_VAR_GETTER
private static final HytaleLogger LOGGER
private final int heldItemSectionId
private final ItemContainer heldItemContainer
private final byte heldItemSlot
private ItemStack heldItem
private final Item originalItemType
private Function<InteractionContext,Map<String,String>> interactionVarsGetter
private final InteractionManager interactionManager
private final Ref<EntityStore> owningEntity
private final Ref<EntityStore> runningForEntity
private LivingEntity entity
private InteractionChain chain
private InteractionEntry entry
private Label[] labels
private InteractionContext.SnapshotProvider snapshotProvider
private final DynamicMetaStore<InteractionContext> metaStore
