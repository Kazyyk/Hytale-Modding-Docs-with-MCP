# WindowManager

Type: class | Package: com.hypixel.hytale.server.core.entity.entities.player.windows

public class WindowManager

## Fields

- private final AtomicInteger windowId
- private final Int2ObjectConcurrentHashMap<Window> windows
- private PlayerRef playerRef

## Methods

- public void init(@Nonnull PlayerRef playerRef)
- @Nullable public UpdateWindow clientOpenWindow(@Nonnull Ref<EntityStore> ref, @Nonnull Window window, @Nonnull Store<EntityStore> store)
- @Nullable public OpenWindow openWindow(@Nonnull Ref<EntityStore> ref, @Nonnull Window window, @Nonnull Store<EntityStore> store)
- @Nullable public List<OpenWindow> openWindows(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull Window... windows)
- public void setWindow(int id, @Nonnull Window window)
- private void setWindow0(int id, @Nonnull Window window)
- @Nullable public Window getWindow(int id)
- @Nonnull public List<Window> getWindows()
- public void updateWindow(@Nonnull Window window)
- @Nonnull public Window closeWindow(@Nonnull Ref<EntityStore> ref, int id, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public void closeAllWindows(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public void markWindowChanged(int id)
- public void updateWindows()
- public void validateWindows(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public static <W extends Window> void closeAndRemoveAll(@Nonnull Map<UUID, W> windows)
- @Override @Nonnull public String toString()

Also in this package: BlockWindow, ContainerBlockWindow, ContainerWindow, ItemContainerWindow, ItemStackContainerWindow, MaterialContainerWindow, MaterialExtraResourcesSection, ValidatedWindow, Window, WindowCloseEvent

Complete API:
  public void init(PlayerRef playerRef)
  public UpdateWindow clientOpenWindow(Ref<EntityStore> ref, Window window, Store<EntityStore> store)
  public OpenWindow openWindow(Ref<EntityStore> ref, Window window, Store<EntityStore> store)
  public List<OpenWindow> openWindows(Ref<EntityStore> ref, Store<EntityStore> store, Window windows)
  public void setWindow(int id, Window window)
  private void setWindow0(int id, Window window)
  public Window getWindow(int id)
  public List<Window> getWindows()
  public void updateWindow(Window window)
  public Window closeWindow(Ref<EntityStore> ref, int id, ComponentAccessor<EntityStore> componentAccessor)
  public void closeAllWindows(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public void markWindowChanged(int id)
  public void updateWindows()
  public void validateWindows(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public static void closeAndRemoveAll(Map<UUID,W> windows)
  public String toString()

Fields:
private static final HytaleLogger LOGGER
private final AtomicInteger windowId
private final Int2ObjectConcurrentHashMap<Window> windows
private final Int2ObjectConcurrentHashMap<EventRegistration<?,?>> windowChangeEvents
private PlayerRef playerRef
