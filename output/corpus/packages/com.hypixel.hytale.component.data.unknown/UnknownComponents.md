# UnknownComponents

Type: class | Package: com.hypixel.hytale.component.data.unknown | Implements: Component

public class UnknownComponents<ECS_TYPE> implements Component

## Fields

- public static final HytaleLogger LOGGER
- public static final String ID
- public static final BuilderCodec<UnknownComponents> CODEC
- private Map<String,BsonDocument> unknownComponents

## Methods

- public void addComponent(String componentId, Component<ECS_TYPE> component, Codec<Component<ECS_TYPE>> codec)
- public void addComponent(String componentId, TempUnknownComponent<ECS_TYPE> component)
- public boolean contains(String componentId)
- @Nullable public T removeComponent(String componentId, Codec<T> codec)
- @Nonnull public Map<String,BsonDocument> getUnknownComponents()
- @Nonnull @Override public Component<ECS_TYPE> clone()
