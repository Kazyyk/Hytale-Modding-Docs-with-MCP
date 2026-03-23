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
