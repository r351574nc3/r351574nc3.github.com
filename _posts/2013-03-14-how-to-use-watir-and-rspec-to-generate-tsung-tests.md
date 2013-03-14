---
layout: post
title: "How To Use Watir and RSpec to Generate Tsung Tests"
description: "Post of a youtube video on using watir to manage tsung
performance tests"
category: Development
tags: [watir, rspec, tsung, performance, howto]
---
{% include JB/setup %}

## Overview

Developing and managing tsung tests performance tests can be difficult
because of the immense amount over verbose XML. Thankfully, much of
what you test for performance is already available as an automated
user interface test via Watir/Selenium/Webdriver. So, why not just
reuse the test instead of maintaining the same test in 2 formats?

Thankfully again, tsung comes with a recorder that allows us to
generate our tests by running our user interface tests. This is an
example of how to do that.

## Get Your Popcorn

<embed width="640" height="385" allowfullscreen="false" quality="high"
name="movie_player" id="movie_player" style=""
src="http://www.youtube.com/v/AIfVUvsU4Fw?hd=1&showinfo=0&amp;enablejsapi=1&amp;et=OEgsToPDskJni4UfFH3f0WbK6L_15ohf&amp;hl=en_US&amp;fs=1"
type="application/x-shockwave-flash" />

There's a <a href="http://www.github.com/r351574nc3/ks-watir">github
project</a> with example source code.


