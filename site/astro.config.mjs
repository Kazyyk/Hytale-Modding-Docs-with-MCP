import { defineConfig } from "astro/config";
import starlight from "@astrojs/starlight";

// https://astro.build/config
export default defineConfig({
  // TODO: Replace with your actual domain once deployed
  site: "https://api.hytale.kazyyk.dev",
  integrations: [
    starlight({
      title: "Hytale API Index",
      description:
        "Auto-generated API reference for Hytale server modding — plugins, events, commands, ECS, and JSON schemas.",
      social: [
        {
          icon: "github",
          label: "GitHub",
          href: "https://github.com/Kazyyk/Hytale-API-Index",
        },
      ],
      editLink: {
        baseUrl:
          "https://github.com/Kazyyk/Hytale-API-Index/edit/main/output/docs/",
      },
      customCss: ["./src/styles/custom.css"],
      sidebar: [
        // Landing page is the index, handled by Starlight automatically
        {
          label: "API Reference",
          items: [
            { slug: "api" }, // api/index.md
            {
              label: "Classes",
              autogenerate: { directory: "api/classes" },
              collapsed: true,
            },
            {
              label: "Events",
              autogenerate: { directory: "api/events" },
              collapsed: true,
            },
            {
              label: "Commands",
              autogenerate: { directory: "api/commands" },
              collapsed: true,
            },
            { slug: "api/components" },
            { slug: "api/registries" },
          ],
        },
        {
          label: "JSON Schemas",
          autogenerate: { directory: "schemas" },
        },
        {
          label: "Internals",
          items: [{ slug: "internals" }],
          collapsed: true,
        },
      ],
      head: [
        {
          tag: "meta",
          attrs: {
            name: "robots",
            content: "index, follow",
          },
        },
      ],
      lastUpdated: true,
    }),
  ],
});
