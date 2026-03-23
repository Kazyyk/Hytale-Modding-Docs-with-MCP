# PersistentModel

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.component | Implements: Component

public class PersistentModel implements Component<EntityStore>

An `EntityStore` component.

## Fields

- private Model.ModelReference modelReference

## Methods

- @Nonnull public static ComponentType<EntityStore, PersistentModel> getComponentType()
- @Nonnull public Model.ModelReference getModelReference()
- public void setModelReference(@Nonnull Model.ModelReference modelReference)
- @Override public Component<EntityStore> clone()
