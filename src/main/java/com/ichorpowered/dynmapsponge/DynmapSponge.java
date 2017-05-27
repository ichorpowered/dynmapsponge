package com.ichorpowered.dynmapsponge;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.plugin.Plugin;

@Plugin(id = "dynmapsponge",
        name = "DynmapSponge",
        description = "A Sponge implementation of the dynamic map plugin.",
        url = "http://ichorpowered.com",
        authors = {"Meronat"})
public class DynmapSponge {

    @Inject
    private Logger logger;

}
