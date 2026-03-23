# UIEventBuilder

Type: class | Package: com.hypixel.hytale.server.core.ui.builder

public class UIEventBuilder

Fluent builder for constructing `CustomUIEventBinding` arrays sent to the client. Each binding associates a UI event type with a CSS-like selector and optional EventData. The `locksInterface` parameter controls whether the event locks UI interaction while processing (defaults to true).

## Fields

- LOGGER | HytaleLogger | Logger instance.
- EMPTY_EVENT_BINDING_ARRAY | CustomUIEventBinding[] | Empty array constant.

## Methods

- addEventBinding(CustomUIEventBindingType type, String selector) | UIEventBuilder | Adds an event binding with no data (locks interface).
- addEventBinding(CustomUIEventBindingType type, String selector, boolean locksInterface) | UIEventBuilder | Adds an event binding with no data and explicit lock control.
- addEventBinding(CustomUIEventBindingType type, String selector, EventData data) | UIEventBuilder | Adds an event binding with data (locks interface).
- addEventBinding(CustomUIEventBindingType type, String selector, @Nullable EventData data, boolean locksInterface) | UIEventBuilder | Adds an event binding with full configuration.
- getEvents() | CustomUIEventBinding[] | Returns the built event binding array.
