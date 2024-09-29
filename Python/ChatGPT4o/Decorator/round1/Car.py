"""
Module docstring: This module defines abstract base classes for car components and 
a concrete implementation of a basic car.
"""

from abc import ABC, abstractmethod

class Car(ABC):
    """Abstract base class for car components."""

    @abstractmethod
    def description(self) -> str:
        """Provides the description of the car."""
        raise NotImplementedError

    @abstractmethod
    def cost(self) -> float:
        """Provides the cost of the car."""
        raise NotImplementedError










