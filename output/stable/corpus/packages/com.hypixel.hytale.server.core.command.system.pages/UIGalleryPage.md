# UIGalleryPage

Type: class | Package: com.hypixel.hytale.server.core.command.system.pages | Extends: InteractiveCustomUIPage

public class UIGalleryPage extends InteractiveCustomUIPage<UIGalleryPage.UIGalleryEventData>

An interactive custom UI page that showcases the available UI component library. Organized by categories (buttons, inputs, selection, containers, text, sliders, progress, scrollbars, navigation, tooltips) with expandable code blocks showing usage examples.

## Key Methods

- public void build( Ref<EntityStore> ref, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, Store<EntityStore> store )
- public void handleDataEvent(Ref<EntityStore> ref, Store<EntityStore> store, UIGalleryPage.UIGalleryEventData data)
- public String getId()
- public String getNameKey()
- public String getDescriptionKey()
- public String getContentPath()
- public int getCodeBlockCount()
- public static UIGalleryPage.Category fromId(String id)
- public static final BuilderCodec<UIGalleryPage.UIGalleryEventData> CODEC = BuilderCodec.builder( UIGalleryPage.UIGalleryEventData.class, UIGalleryPage.UIGalleryEventData::new )

Also in this package: Category, CommandListPage, CommandListPageEventData, SearchResult, UIGalleryEventData

Complete API:
  public void build(Ref<EntityStore> ref, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, Store<EntityStore> store)
  public void handleDataEvent(Ref<EntityStore> ref, Store<EntityStore> store, UIGalleryPage.UIGalleryEventData data)
  private void buildCategoryList(UICommandBuilder commandBuilder, UIEventBuilder eventBuilder)
  private void displayCategory(UIGalleryPage.Category category, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder)
  private void toggleCodeBlock(int index, UICommandBuilder commandBuilder)

Fields:
private static final Value<String> CATEGORY_BUTTON_STYLE
private static final Value<String> CATEGORY_BUTTON_SELECTED_STYLE
private UIGalleryPage.Category selectedCategory
private final IntSet expandedCodeBlocks
