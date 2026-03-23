# PageManager

Type: class | Package: com.hypixel.hytale.server.core.entity.entities.player.pages

public class PageManager

## Fields

- private WindowManager windowManager
- private PlayerRef playerRef
- private CustomUIPage customPage
- private final AtomicInteger customPageRequiredAcknowledgments

## Methods

- public void init(@Nonnull PlayerRef playerRef, @Nonnull WindowManager windowManager)
- public void clearCustomPageAcknowledgements()
- @Nullable public CustomUIPage getCustomPage()
- public void setPage(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull Page page)
- public void setPage(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull Page page, boolean canCloseThroughInteraction)
- public void openCustomPage(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull CustomUIPage page)
- public boolean setPageWithWindows( @Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull Page page, boolean canCloseThroughInteraction, @Nonnull Window... windows )
- public boolean openCustomPageWithWindows( @Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull CustomUIPage page, @Nonnull Window... windows )
- public void updateCustomPage(@Nonnull CustomPage page)
- public void handleEvent(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull CustomPageEvent event)

Also in this package: BasicCustomUIPage, CustomUIPage, InteractiveCustomUIPage, RespawnPage, RespawnPageEventData

Complete API:
  public void init(PlayerRef playerRef, WindowManager windowManager)
  public void clearCustomPageAcknowledgements()
  public CustomUIPage getCustomPage()
  public void setPage(Ref<EntityStore> ref, Store<EntityStore> store, Page page)
  public void setPage(Ref<EntityStore> ref, Store<EntityStore> store, Page page, boolean canCloseThroughInteraction)
  public void openCustomPage(Ref<EntityStore> ref, Store<EntityStore> store, CustomUIPage page)
  public boolean setPageWithWindows(Ref<EntityStore> ref, Store<EntityStore> store, Page page, boolean canCloseThroughInteraction, Window windows)
  public boolean openCustomPageWithWindows(Ref<EntityStore> ref, Store<EntityStore> store, CustomUIPage page, Window windows)
  public void updateCustomPage(CustomPage page)
  public void handleEvent(Ref<EntityStore> ref, Store<EntityStore> store, CustomPageEvent event)

Fields:
private WindowManager windowManager
private PlayerRef playerRef
private CustomUIPage customPage
private final AtomicInteger customPageRequiredAcknowledgments
