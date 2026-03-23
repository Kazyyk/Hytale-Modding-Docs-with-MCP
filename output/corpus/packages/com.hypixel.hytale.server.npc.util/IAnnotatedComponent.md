# IAnnotatedComponent

Type: interface | Package: com.hypixel.hytale.server.npc.util

public interface IAnnotatedComponent

Interface for NPC components that can provide debug annotation and hierarchical breadcrumb paths. Used by the NPC debugging infrastructure.

## Methods

- void getInfo(Role var1, ComponentInfo var2)
- void setContext(IAnnotatedComponent var1, int var2)
- IAnnotatedComponent getParent()
- int getIndex()
- default String getLabel()
- default void getBreadCrumbs(@Nonnull StringBuilder sb)
- default String getBreadCrumbs()
