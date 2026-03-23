# ImageImportPage

Type: class | Package: com.hypixel.hytale.builtin.buildertools.imageimport

public class ImageImportPage

Interactive custom UI page for importing images as block selections. Supports file browsing within asset pack directories, configurable max dimension (1-512), orientation (wall XY/XZ, floor), and origin point (bottom-left, bottom-center, center, top-center). Converts image pixels to closest block types via `BlockColorIndex` and places the result into the player's clipboard as a `BlockSelection`.

Also in this package: ImageImportCommand, Orientation, Origin, PageData

Complete API:
  public void build(Ref<EntityStore> ref, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, Store<EntityStore> store)
  private void buildBrowserPage(UICommandBuilder commandBuilder, UIEventBuilder eventBuilder)
  private void updateStatus(UICommandBuilder commandBuilder)
  private void setError(String message)
  private void setStatus(String message)
  public void handleDataEvent(Ref<EntityStore> ref, Store<EntityStore> store, ImageImportPage.PageData data)
  private boolean handleBrowserEvent(ImageImportPage.PageData data)
  private void rebuildBrowser()
  private void performImport(Ref<EntityStore> ref, Store<EntityStore> store)

Fields:
private static final int DEFAULT_MAX_SIZE
private static final int MIN_SIZE
private static final int MAX_SIZE
private static final String ASSET_PACK_SUB_PATH
private String imagePath
private int maxDimension
private String orientationStr
private ImageImportPage.Orientation orientation
private String originStr
private ImageImportPage.Origin origin
private String statusMessage
private boolean isError
private boolean isProcessing
private boolean showBrowser
private final ServerFileBrowser browser
