# EntityUIModule

Type: class | Package: com.hypixel.hytale.server.core.modules.entityui | Extends: JavaPlugin

public class EntityUIModule extends JavaPlugin

## Fields

- public static final PluginManifest MANIFEST
- private static EntityUIModule instance
- private ComponentType<EntityStore, UIComponentList> uiComponentListType

## Methods

- public static EntityUIModule get()
- public ComponentType<EntityStore, UIComponentList> getUIComponentListType()
- @Override protected void setup()
- private void onLoadedAssetsEvent(LoadedAssetsEvent<String, EntityUIComponent, IndexedLookupTableAssetMap<String, EntityUIComponent>> event)

Also in this package: Remove, Setup, UIComponentList, UIComponentSystems, Update

Complete API:
  public static EntityUIModule get()
  public ComponentType<EntityStore,UIComponentList> getUIComponentListType()
  protected void setup()
  private void onLoadedAssetsEvent(LoadedAssetsEvent<String,EntityUIComponent,IndexedLookupTableAssetMap<String,EntityUIComponent>> event)

Fields:
public static final PluginManifest MANIFEST
private static EntityUIModule instance
private ComponentType<EntityStore,UIComponentList> uiComponentListType
