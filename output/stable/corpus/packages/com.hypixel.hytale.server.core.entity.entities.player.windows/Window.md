# Window

Type: abstract class | Package: com.hypixel.hytale.server.core.entity.entities.player.windows

public abstract class Window

## Fields

- protected final WindowType windowType
- protected final AtomicBoolean isDirty
- protected final AtomicBoolean needRebuild
- private int id
- private WindowManager manager
- private PlayerRef playerRef

## Methods

- public void init(@Nonnull PlayerRef playerRef, @Nonnull WindowManager manager)
- @Nonnull public abstract JsonObject getData()
- protected boolean onOpen(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store)
- protected abstract boolean onOpen0(@Nonnull Ref<EntityStore> var1, @Nonnull Store<EntityStore> var2)
- protected void onClose(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- protected abstract void onClose0(@Nonnull Ref<EntityStore> var1, @Nonnull ComponentAccessor<EntityStore> var2)
- public void handleAction(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull WindowAction action)
- @Nonnull public WindowType getType()
- public void setId(int id)
- public int getId()
- @Nullable public PlayerRef getPlayerRef()
- public void close(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- protected void invalidate()
- protected void setNeedRebuild()
- protected boolean consumeIsDirty()
- protected void consumeNeedRebuild()
- @Nonnull public EventRegistration registerCloseEvent(@Nonnull Consumer<Window.WindowCloseEvent> consumer)
- @Nonnull public EventRegistration registerCloseEvent(short priority, @Nonnull Consumer<Window.WindowCloseEvent> consumer)
- @Nonnull public EventRegistration registerCloseEvent(@Nonnull EventPriority priority, @Nonnull Consumer<Window.WindowCloseEvent> consumer)
- @Override public boolean equals(@Nullable Object o)
- @Override public int hashCode()

## Inner Types

- `Window.WindowCloseEvent`

Known subclasses: BlockWindow, ContainerWindow, FieldCraftingWindow, ItemStackContainerWindow, MemoriesWindow

Also in this package: BlockWindow, ContainerBlockWindow, ContainerWindow, ItemContainerWindow, ItemStackContainerWindow, MaterialContainerWindow, MaterialExtraResourcesSection, ValidatedWindow, WindowCloseEvent, WindowManager

Complete API:
  public void init(PlayerRef playerRef, WindowManager manager)
  public abstract JsonObject getData()
  protected boolean onOpen(Ref<EntityStore> ref, Store<EntityStore> store)
  protected abstract boolean onOpen0(Ref<EntityStore> var1, Store<EntityStore> var2)
  protected void onClose(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  protected abstract void onClose0(Ref<EntityStore> var1, ComponentAccessor<EntityStore> var2)
  public void handleAction(Ref<EntityStore> ref, Store<EntityStore> store, WindowAction action)
  public WindowType getType()
  public void setId(int id)
  public int getId()
  public PlayerRef getPlayerRef()
  public void close(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  protected void invalidate()
  protected void setNeedRebuild()
  protected boolean consumeIsDirty()
  protected void consumeNeedRebuild()
  public EventRegistration registerCloseEvent(Consumer<Window.WindowCloseEvent> consumer)
  public EventRegistration registerCloseEvent(short priority, Consumer<Window.WindowCloseEvent> consumer)
  public EventRegistration registerCloseEvent(EventPriority priority, Consumer<Window.WindowCloseEvent> consumer)
  public boolean equals(Object o)
  public int hashCode()

Fields:
public static final Map<WindowType,Supplier<? extends Window>> CLIENT_REQUESTABLE_WINDOW_TYPES
protected static final HytaleLogger LOGGER
protected final SyncEventBusRegistry<Void,Window.WindowCloseEvent> closeEventRegistry
protected final WindowType windowType
protected final AtomicBoolean isDirty
protected final AtomicBoolean needRebuild
private int id
private WindowManager manager
private PlayerRef playerRef
