# Blackboard

Type: class | Package: com.hypixel.hytale.server.npc.blackboard | Implements: Resource

public class Blackboard implements Resource

## Fields

- public static final HytaleLogger LOGGER
- private final ConcurrentHashMap<Class<? extends IBlackboardView<?>>,IBlackboardViewManager<?>> views

## Methods

- public static ResourceType<EntityStore,Blackboard> getResourceType()
- public void init(World world)
- public void onEntityDamageBlock(Ref<EntityStore> ref, DamageBlockEvent event)
- public void onEntityBreakBlock(Ref<EntityStore> ref, BreakBlockEvent event)
- private void registerViewType(Class<View> clazz, IBlackboardViewManager<View> holder)
- public void cleanupViews()
- public void clear()
- public void onWorldRemoved()
- public void forEachView(Class<View> viewTypeClass, Consumer<View> consumer)
- public View getView(Class<View> viewTypeClass, Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
- public View getView(Class<View> viewTypeClass, int chunkX, int chunkZ)
- public View getView(Class<View> viewTypeClass, long index)
- public View getIfExists(Class<View> viewTypeClass, long index)
- @Nonnull private IBlackboardViewManager<View> getViewManager(Class<View> viewTypeClass)
- @Nonnull @Override public Resource<EntityStore> clone()

Complete API:
  public static ResourceType<EntityStore,Blackboard> getResourceType()
  public void init(World world)
  public void onEntityDamageBlock(Ref<EntityStore> ref, DamageBlockEvent event)
  public void onEntityBreakBlock(Ref<EntityStore> ref, BreakBlockEvent event)
  private void registerViewType(Class<View> clazz, IBlackboardViewManager<View> holder)
  public void cleanupViews()
  public void clear()
  public void onWorldRemoved()
  public void forEachView(Class<View> viewTypeClass, Consumer<View> consumer)
  public View getView(Class<View> viewTypeClass, Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public View getView(Class<View> viewTypeClass, int chunkX, int chunkZ)
  public View getView(Class<View> viewTypeClass, long index)
  public View getIfExists(Class<View> viewTypeClass, long index)
  private IBlackboardViewManager<View> getViewManager(Class<View> viewTypeClass)
  public Resource<EntityStore> clone()

Fields:
public static final HytaleLogger LOGGER
private final ConcurrentHashMap<Class<? extends IBlackboardView<?>>,IBlackboardViewManager<?>> views
